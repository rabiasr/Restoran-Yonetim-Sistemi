package roller;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import yazlabb3.Yazlabb3;

public class Garson extends Thread {

    private int garsonId;
    private boolean garson;
    private int masaId = -1;
    Asci asci = new Asci();
    Yazlabb3 r;
    public static int masa = 0;
    Color renk = new Color(204, 255, 204);

    public Garson(int garsonId) {
        this.garsonId = garsonId;
        this.garson = garson;
    }

    public int getGarsonId() {
        return garsonId;
    }

    public void setGarsonId(int garsonId) {
        this.garsonId = garsonId;
    }

    public boolean isGarson() {
        return garson;
    }

    public void setGarson(boolean garson) {
        this.garson = garson;
    }

    @Override
    public void run() {

        while (true) {
            if (r.full6 == true) {
                if (!r.Garsonlar.get(garsonId).isGarson()) {

               
                    try {
                         TimeUnit.SECONDS.sleep(3);
                          alSiparis(masaId);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Garson.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }


        }
    }

    public void alSiparis(int masaId) {
        try {
            if (masaId != -1 && r.Masalar.get(masaId).getDurum() == 1) {

                synchronized (r.Garsonlar.get(garsonId)) {
                    r.Garsonlar.get(garsonId).setGarson(true);
                    r.Masalar.get(masaId).setGarsonId(garsonId);
                    r.Masalar.get(masaId).setDurum(2);

                    System.out.println("Garson flag: " + r.Garsonlar.get(garsonId).isGarson() + (garsonId + 1) + " : Sipariþ alýndý. Masa " + (masaId + 1));

                    synchronized(r.siparisBekleyenler){
                           r.siparisBekleyenler.add(r.Masalar.get(masaId));
                            r.siparisBekleyenler.notifyAll();
                    }
                 
                    if (garsonId == 0) {
                        r.arayuz.siparis1txt.setText(" " + (masaId + 1) + " ");
                        r.arayuz.siparis1txt.setBackground(renk);
                    }  else  if (garsonId == 1) {
                        r.arayuz.siparis2txt.setText(" " + (masaId + 1) + " ");
                        r.arayuz.siparis2txt.setBackground(renk);
                    } else if (garsonId == 2) {
                        r.arayuz.siparis3txt.setText(" " + (masaId + 1) + " ");
                        r.arayuz.siparis3txt.setBackground(renk);

                    }

                }

            } 
                               

        } catch (Exception e) {
        }

    }

    public int getMasaId() {
        return masaId;
    }

    public void setMasaId(int masaId) {
        this.masaId = masaId;
    }

}
