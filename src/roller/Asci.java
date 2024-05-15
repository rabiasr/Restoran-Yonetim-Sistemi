package roller;

import java.awt.Color;
import static java.lang.Thread.currentThread;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import yazlabb3.Simulasyon;
import yazlabb3.Yazlabb3;

public class Asci extends Thread {

    public volatile boolean dolu;
    private int asciId;
    private final int kota = 2;
    private static volatile boolean siparisGeldi;
    public volatile boolean yemekm = false;
    public volatile boolean yemekm2 = false;
    public final Object lock = new Object();
    public static boolean garson = false;
    public static int garson1 = 0;
    private volatile boolean calis = false;
    public static boolean ilk3 = false;
    private Semaphore sem = new Semaphore(2, true);
    Yazlabb3 r;
    Simulasyon s;
    public static Masa masa;
    public static Masa masa1;
    public static Masa masa2;
    public int sayac;
    public static int yemek = 0;
    public static int count = 0;
 Color renk = new Color(204, 255, 204);

    public int getAsciId() {
        return asciId;
    }

    public void setAsciId(int asciId) {
        this.asciId = asciId;
    }

    public Semaphore getSem() {
        return sem;
    }

    public void setSem(Semaphore sem) {
        this.sem = sem;
    }

    public Asci(int asciId) {
        this.asciId = asciId;
        this.sem = new Semaphore(kota, true);
        this.dolu = false;
        this.calis = false;
        this.sayac = 0;
        this.count = count;

    }

    public Asci() {

    }

    @Override
    public void run() {

        while (true) {

            if (!r.Ascilar.get(asciId).dolu) {
                synchronized (r.Ascilar.get(asciId)) {
                    if (r.siparisBekleyenler.size() == 3 && ilk3 == false) {

                        dene();

                    } else if (r.siparisBekleyenler.size() > 0 && ilk3 == true) {

                        dene1();

                    }

                }
            }

        }

    }

    public synchronized void dene1() {

        {

            synchronized (r.siparisBekleyenler) {
                // Sipariþ bekleyen varsa devam et, yoksa bekle
                while (r.siparisBekleyenler.isEmpty()) {
                    try {
                        r.siparisBekleyenler.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                masa1 = r.siparisBekleyenler.remove(0);

                if (masa1 != null) {
                    synchronized (masa1) {
                        // Aþçý kotasýný kontrol et
                        if (r.Ascilar.get(asciId).sayac < kota) {
                            try {
                                // Aþçý kotasý dolu deðilse sipariþi al ve hazýrla
                                sem.acquire();
                            } catch (InterruptedException ex) {

                                Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            yemekYap(masa1);
                            sem.release();
                        }

                    }
                }

                r.siparisBekleyenler.notifyAll();

            }

        }

    }

    public boolean isSiparisGeldi() {
        return siparisGeldi;
    }

    public void setSiparisGeldi(boolean siparisGeldi) {
        this.siparisGeldi = siparisGeldi;
    }

    public synchronized void dene() {
 
            synchronized (r.siparisBekleyenler) {
                // Sipariþ bekleyen varsa devam et, yoksa bekle
                while (r.siparisBekleyenler.isEmpty()) {
                    try {
                        r.siparisBekleyenler.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                // Ýki masa sipariþini al

                if (yemek != -1) {
                    masa1 = r.siparisBekleyenler.get(yemek);

                    if (masa1 != null) {
                        synchronized (masa1) {
                            // Aþçý kotasýný kontrol et
                            if (r.Ascilar.get(asciId).sayac < kota) {
                                try {
                                    // Aþçý kotasý dolu deðilse sipariþi al ve hazýrla
                                    sem.acquire();
                                } catch (InterruptedException ex) {

                                    Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                yemekYap(masa1);
                                sem.release();
                            }
                        }
                    }
                }
                yemek++;
                if (yemek >= 3) {
                    yemek = -1;
                }

                if (yemek == -1) {

                    r.siparisBekleyenler.remove(0);
                    r.siparisBekleyenler.remove(0);
                    r.siparisBekleyenler.remove(0);
                    //  count++;
                    ilk3 = true;
                }

                r.siparisBekleyenler.notifyAll();

            }
 

    }

    public synchronized void yemekYap(Masa masa) {

        try {

            synchronized (r.Ascilar.get(asciId)) {
                         
               
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Asci.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("aþçý " + (asciId + 1) + "masa->" + (masa.getMasaId() + 1) + "yemek yapmaya baþladý");

                if (asciId == 0 && !ilk3) {
                    r.Ascilar.get(asciId).count++;

                    if (r.Ascilar.get(asciId).count == 1) {
                        r.arayuz.yemek1a1.setText(" " + (masa.getMasaId() + 1) + " ");
                        r.arayuz.yemek1a1.setBackground(renk);

                    }
                    if (r.Ascilar.get(asciId).count == 2) {
                        r.arayuz.yemek2a1.setText(" " + (masa.getMasaId() + 1) + " ");
                        r.arayuz.yemek2a1.setBackground(renk);

                    }
                    if (r.Ascilar.get(asciId).count >= 2) {
                        r.Ascilar.get(asciId).count = 0;
                    }

                }
            else if (asciId == 1 && !ilk3) {
                    r.Ascilar.get(asciId).count++;

                    if (r.Ascilar.get(asciId).count == 1) {
                        r.arayuz.yemek1a2.setText(" " + (masa.getMasaId() + 1) + " ");
                        r.arayuz.yemek1a2.setBackground(renk);

                    }
                   if (r.Ascilar.get(asciId).count == 2) {
                        r.arayuz.yemek2a2.setText(" " + (masa.getMasaId() + 1) + " ");
                        r.arayuz.yemek2a2.setBackground(renk);
                        
                    }
                    if (r.Ascilar.get(asciId).count >= 2) {
                        r.Ascilar.get(asciId).count = 0;
                    }

                }
             else  if (asciId == 0 && ilk3) {

                    r.Ascilar.get(asciId).count++;

                    if (r.Ascilar.get(asciId).count == 1) {
                        r.arayuz.yemek1a1.setText(" " + (masa.getMasaId() + 1) + " ");
                         r.arayuz.yemek1a1.setBackground(renk);
                       
                    }
                      if (r.Ascilar.get(asciId).count == 2) {
                        r.arayuz.yemek2a1.setText(" " + (masa.getMasaId() + 1) + " ");
                         r.arayuz.yemek2a1.setBackground(renk);
                       
                    }
                    if (r.Ascilar.get(asciId).count >= 2) {
                        r.Ascilar.get(asciId).count = 0;
                    }

                }
              else  if (asciId == 1 && ilk3) {

                    r.Ascilar.get(asciId).count++;

                    if (r.Ascilar.get(asciId).count == 1) {
                        r.arayuz.yemek1a2.setText(" " + (masa.getMasaId() + 1) + " ");
                         r.arayuz.yemek1a2.setBackground(renk);
                       
                    }
                    if (r.Ascilar.get(asciId).count == 2) {
                        r.arayuz.yemek2a2.setText(" " + (masa.getMasaId() + 1) + " ");
                        r.arayuz.yemek2a2.setBackground(renk);
                        
                    }
                    if (r.Ascilar.get(asciId).count >= 2) {
                        r.Ascilar.get(asciId).count = 0;
                    }
                }
 
           
             r.Masalar.get(masa.getMasaId()).setDurum(3);
                r.Masalar.get(masa.getMasaId()).setAsciId(asciId);
              }    

            
            synchronized (lock) {
                r.Ascilar.get(asciId).sayac++; // Aþçý kotasýný arttýr
                //  count++;

                if (r.Ascilar.get(asciId).sayac >= kota) {
                    dolu = true; // Aþçý kotasý doldu
                    r.Ascilar.get(asciId).setCalis(false);

                }
                lock.notifyAll();
            }

            if ((r.Masalar.get(masa.getMasaId()).getDurum() == 3)) {
                yemekBitir(masa);
                garson = true;
                //   r.Garsonlar.get(r.Masalar.get(masa.getMasaId()).getGarsonId()).setGarson(false);
                if (r.Masalar.get(masa.getMasaId()).getGarsonId() == 0) {

                    r.arayuz.siparis1txt.setText("");
                    r.arayuz.siparis1txt.setBackground(Color.WHITE);
                    r.Garsonlar.get(0).setGarson(false);
                }
               if (r.Masalar.get(masa.getMasaId()).getGarsonId() == 1) {

                    r.arayuz.siparis2txt.setText("");
                    r.arayuz.siparis2txt.setBackground(Color.WHITE);
                    r.Garsonlar.get(1).setGarson(false);
                }
               if (r.Masalar.get(masa.getMasaId()).getGarsonId() == 2) {

                    r.arayuz.siparis3txt.setText("");
                    r.arayuz.siparis3txt.setBackground(Color.WHITE);
                    r.Garsonlar.get(2).setGarson(false);

                }

            }

        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
 
    }

    public synchronized void yemekBitir(Masa masa) {
        try {

            r.Masalar.get(masa.getMasaId()).setDurum(4);
 
        } catch (Exception e) {
        }

    }

    public boolean isCalis() {
        return calis;
    }

    public void setCalis(boolean calis) {
        this.calis = calis;
    }

}
