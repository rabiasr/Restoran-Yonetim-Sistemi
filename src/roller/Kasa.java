package roller;

import java.awt.Color;
import static java.lang.Thread.currentThread;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static roller.Asci.masa1;
import yazlabb3.Simulasyon;
import yazlabb3.Yazlabb3;

public class Kasa extends Thread {

    public static volatile ArrayList<Masa> kasalar1 = new ArrayList<>();
    public static volatile ArrayList<Masa> kasalar2 = new ArrayList<>();
    public static volatile ArrayList<Masa> kasalar3 = new ArrayList<>();
    public static volatile ArrayList<Masa> kasalar = new ArrayList<>();
    public static volatile int sayac = 0;
    public static volatile int sayac1 = 0;
 Color renk=new Color(229,213,234);
    public final Object lock = new Object();
    private Semaphore sem = new Semaphore(1, true);
    public static Masa masa;
    public static Yazlabb3 r;
    private int id;
    public static volatile boolean ilk3 = false;
    public static volatile boolean dolu = false;
    public static volatile boolean dolu1 = false;
    public static volatile boolean dolu2 = false;
    public static Musteri m;
    public static int count=0;
    public static int  toplam=0;
    public Kasa() {
    }

    public Kasa(int i) {
        this.id = i;
        this.sem = new Semaphore(1, true);

    }

    @Override
    public void run() {

        while (true) {

            if (dolu && !ilk3) {

                try {

                    dene();

                    TimeUnit.SECONDS.sleep(2);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Kasa.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (kasalar2.size() > 0) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    dene1();

                } catch (InterruptedException ex) {
                    Logger.getLogger(Kasa.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (kasalar3.size() == 2) {
                try {
                    for (int i = 0; i < 2; i++) {

                        dene2();

                        TimeUnit.SECONDS.sleep(1);

                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Kasa.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public void dene1() {

        synchronized (kasalar2) {
            dolu2 = false;
            // Sipariþ bekleyen varsa devam et, yoksa bekle
            while (kasalar2.isEmpty()) {
                try {
                    kasalar2.wait();

                } catch (InterruptedException ex) {
                    Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            masa = kasalar2.remove(0);
            kasalar.remove(0);
            if (masa != null && masa.getDurum() == 6) {
                synchronized (masa) {
                    // Aþçý kotasýný kontrol et

                    try {
                        // Aþçý kotasý dolu deðilse sipariþi al ve hazýrla
                        sem.acquire();

                    } catch (InterruptedException ex) {

                        Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    hesapOde(masa);
                    sem.release();
                    masa.notifyAll();
                }
            }
            kasalar2.notifyAll();
            ilk3 = false;
            dolu = false;
            dolu1 = false;
            dolu2 = true;
        }
    }

    public void dene2() {

        synchronized (kasalar3) {

            if (kasalar3.size() != 0) {

                masa = kasalar3.remove(0);
                kasalar.remove(0);
                sayac++;
                if (masa != null && masa.getDurum() == 6) {
                    synchronized (masa) {
                        // Aþçý kotasýný kontrol et

                        try {
                            // Aþçý kotasý dolu deðilse sipariþi al ve hazýrla
                            sem.acquire();

                        } catch (InterruptedException ex) {

                            Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        hesapOde(masa);
                        sem.release();
                        masa.notifyAll();

                    }
                }
                kasalar3.notifyAll();

                if (sayac == 2) {
                    ilk3 = true;
                    dolu1 = true;
                    dolu2 = false;
                }
            }
        }
    }

    public void dene() {

        synchronized (kasalar1) {

            if (kasalar1.size() != 0) {

                masa = kasalar1.remove(0);
                sayac1++;
                kasalar.remove(0);
                if (sayac1 == 3) {
                    ilk3 = true;
                }
                if (masa != null && masa.getDurum() == 6) {
                    synchronized (masa) {
                        // Aþçý kotasýný kontrol et

                        try {
                            // Aþçý kotasý dolu deðilse sipariþi al ve hazýrla
                            sem.acquire();

                        } catch (InterruptedException ex) {

                            Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        hesapOde(masa);
                        sem.release();
                        masa.notifyAll();

                    }
                }
                kasalar1.notifyAll();
            }
        }
    }

    public synchronized void hesapOde(Masa masa) {

        try {
            count++;
            System.out.println("kasa  masa " + (masa.getMasaId() + 1) + " nin hesabýný aldý ve masa " + (masa.getMasaId() + 1) + " boþaldý ");
            //System.out.println("bekleyenler : ");
            r.arayuz.odemeyapan.setText(" " + (masa.getMasaId() + 1) + " ");
            r.arayuz.odemeyapan.setBackground(renk);
            r.arayuz.azalt(masa.getMasaId());
//            for (int i = 0; i < kasalar.size(); i++) {
//                System.out.println(kasalar.get(i).getMasaId() + 1);
//
//            }
//         
           
                    masa.setDurum(0);
                    toplam++;
                    r.Masalar.get(masa.getMasaId()).setGarsonId(-1);

                    r.Musteriler.get(masa.getMusId()).setMasaid(-1);

                    r.Musteriler.get(masa.getMusId()).setOldu(true);
                    r.icerdekiler.remove(0);

                    m.musteriSayac--;  
                    masa.setMusId(-1);
                       
                    
                    r.arayuz.toplamMusteri.setText(""+toplam+"");
                    r.arayuz.toplamOdeme.setText(""+(toplam*10)+"");
                    

        } finally {
            masa.notifyAll();  
        }

    }

}
