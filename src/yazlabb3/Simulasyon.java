package yazlabb3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import roller.Asci;
import roller.Kasa;
import static roller.Kasa.kasalar;
import static roller.Kasa.m;
import static roller.Kasa.r;
import roller.Masa;
import static yazlabb3.Yazlabb3.Musteriler;

public class Simulasyon {

    Color renk = new Color(204, 255, 204);
    Yazlabb3 restoran;
    public static int musteri = 0;
    public static int garson = 0;
    Asci asci = new Asci();
    Kasa kasa = new Kasa();
    public static int a;
    public static volatile boolean ilk6 = false;

    public void oturt(Masa masa) throws InterruptedException {

        if (masa.getDurum() == 0) {

            restoran.Musteriler.get(musteri).setMasaid(masa.getMasaId());

            musteri++;
            if (musteri >= restoran.Musteriler.size()) {
                musteri = 0;
            }

        } else if (masa.getDurum() == 1) {

            restoran.Garsonlar.get(garson).setMasaId(masa.getMasaId());

            garson++;
            if (garson >= restoran.Garsonlar.size()) {
                garson = 0;
            }

        }
        if (masa.getDurum() == 4) {

            System.out.println("Aþçý " + (masa.getAsciId() + 1) + "masa->" + (masa.getMasaId() + 1) + " yemeði bitirdi" + "ve " + "masa->" + (masa.getMasaId() + 1) + "yemek yemeye baþladý");

            synchronized (restoran.Ascilar.get(masa.getAsciId())) {
                restoran.Ascilar.get(masa.getAsciId()).sayac--;
                //  count--;
                if (restoran.Ascilar.get(masa.getAsciId()).dolu) {
                    restoran.Ascilar.get(masa.getAsciId()).dolu = false;
                    restoran.Ascilar.get(masa.getAsciId()).setCalis(true);

                }
                if ((masa.getAsciId() == 0)) {
                    if (restoran.arayuz.yemek1a1.getText().equalsIgnoreCase(" " + (masa.getMasaId() + 1) + " ")) {
                        restoran.arayuz.yemek1a1.setText("");
                        restoran.arayuz.yemek1a1.setBackground(Color.WHITE);

                    } else if (restoran.arayuz.yemek2a1.getText().equalsIgnoreCase(" " + (masa.getMasaId() + 1) + " ")) {
                        restoran.arayuz.yemek2a1.setText("");
                         restoran.arayuz.yemek2a1.setBackground(Color.WHITE);
                    }
                } else if ((masa.getAsciId() == 1)) {
                    if (restoran.arayuz.yemek1a2.getText().equalsIgnoreCase(" " + (masa.getMasaId() + 1) + " ")) {
                        restoran.arayuz.yemek1a2.setText("");
                        restoran.arayuz.yemek1a2.setBackground(Color.WHITE);
                     
                    } else if (restoran.arayuz.yemek2a2.getText().equalsIgnoreCase(" " + (masa.getMasaId() + 1) + " ")) {
                        restoran.arayuz.yemek2a2.setText("");
                         restoran.arayuz.yemek2a2.setBackground(Color.WHITE);
                       
                    }
                }
                if (masa.getMasaId() == 0) {
                    restoran.arayuz.musteri1txt.setBackground(renk);
                }
                if (masa.getMasaId() == 1) {
                    restoran.arayuz.musteri2txt.setBackground(renk);
                }
                if (masa.getMasaId() == 2) {
                    restoran.arayuz.musteri3txt.setBackground(renk);
                }
                if (masa.getMasaId() == 3) {
                    restoran.arayuz.musteri4txt.setBackground(renk);
                }
                if (masa.getMasaId() == 4) {
                    restoran.arayuz.musteri5txt.setBackground(renk);
                }
                if (masa.getMasaId() == 5) {
                    restoran.arayuz.musteri6txt.setBackground(renk);
                }
                masa.setDurum(5);

                restoran.Ascilar.get(masa.getAsciId()).notifyAll();

            }

        } else if (masa.getDurum() == 5) {
            masa.setDurum(6);

            System.out.println("masa " + (masa.getMasaId() + 1) + " yemek yemeyi bitirdi ve kasaya gitti");
            restoran.siparisler.add(masa);
            a++;
            if (masa.getMasaId() == 0) {
                restoran.arayuz.musteri1txt.setBackground(Color.WHITE);
            }
            if (masa.getMasaId() == 1) {
                restoran.arayuz.musteri2txt.setBackground(Color.WHITE);
            }
            if (masa.getMasaId() == 2) {
                restoran.arayuz.musteri3txt.setBackground(Color.WHITE);
            }
            if (masa.getMasaId() == 3) {
                restoran.arayuz.musteri4txt.setBackground(Color.WHITE);
            }
            if (masa.getMasaId() == 4) {
                restoran.arayuz.musteri5txt.setBackground(Color.WHITE);
            }
            if (masa.getMasaId() == 5) {
                restoran.arayuz.musteri6txt.setBackground(Color.WHITE);
            }

            if (ilk6 == false) {

                if (a == 3) {
                    for (int i = 0; i < 3; i++) {
                        masa = restoran.siparisler.get(i);
                        kasa.kasalar1.add(masa);
                    }

                    if (kasa.kasalar1.size() == 3) {
                        kasa.dolu = true;
                        kasa.kasalar.addAll(kasa.kasalar1);
                    }
                    restoran.siparisler.clear();

                }
                if (a == 4) {
                    masa = restoran.siparisler.get(0);
                    kasa.kasalar2.add(masa);
                    kasa.dolu1 = true;
                    kasa.kasalar.addAll(kasa.kasalar2);

                    restoran.siparisler.clear();

                }
                if (a == 6) {
                    for (int i = 0; i < 2; i++) {
                        masa = restoran.siparisler.get(i);
                        kasa.kasalar3.add(masa);
                    }
                  
                    if (kasa.kasalar3.size() == 2) {
                        kasa.dolu2 = true;
                        kasa.kasalar.addAll(kasa.kasalar3);
                        ilk6 = true;

                    }
                restoran.siparisler.clear();


                }

            } 
            else {
                kasa.kasalar2.add(masa);
                kasa.kasalar.addAll(kasa.kasalar2);
            }
            TimeUnit.SECONDS.sleep(1);

       } 

    }

}
