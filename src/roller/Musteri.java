package roller;

import java.util.logging.Level;
import java.util.logging.Logger;
import yazlabb3.Yazlabb3;

public class Musteri extends Thread {

    public boolean isOldu() {
        return oldu;
    }

    public void setOldu(boolean aOldu) {
        oldu = aOldu;
    }

    public boolean isOturdu() {
        return oturdu;
    }

    public void setOturdu(boolean aOturdu) {
        oturdu = aOturdu;
    }

    Yazlabb3 r;
    private int musteriId;
    private int masaid = -1;
    public static int masa = 0;
    public static int musteriSayac = 0;
    public static Object lock = new Object();
    private boolean oldu;
    private boolean oturdu;
 public static int sayac = 0;
 private boolean cikti=false;
    public Musteri(int musteriId) {
        this.musteriId = musteriId;
        this.masaid = masaid;
        this.oldu = oldu;
        this.oturdu = oturdu;
        this.cikti=cikti;
    }

    @Override
    public void run() {

        while (true) {

            
                if (!r.Musteriler.get(musteriId).isOturdu()) {
                    synchronized (r.Musteriler.get(musteriId)) {
                        if (sayac == r.threadkes) {
                        if (musteriId >= r.threadkes && !r.Musteriler.get(musteriId).isCikti()) {
                            cik();
                        }
                      

                    }  
                    else{
                        otur();
                    }
                    }

                }

        }
    }

    public void otur() {

        if (masaid != -1 && r.Masalar.get(masaid).getDurum() == 0) {

            if (musteriId == 6) {
               // r.full6 = false;
                r.full = true;
                r.Garsonlar.get(0).setGarson(false);
                r.Garsonlar.get(0).setMasaId(-1);

                r.Garsonlar.get(1).setGarson(false);
                r.Garsonlar.get(1).setMasaId(-1);
                r.Garsonlar.get(2).setGarson(false);
                r.Garsonlar.get(2).setMasaId(-1);

            }
            synchronized (r.Musteriler.get(musteriId)) {
                r.Musteriler.get(musteriId).setOturdu(true);
                r.Masalar.get(masaid).setMusId(musteriId);
                r.Masalar.get(masaid).setDurum(1);
                r.icerdekiler.add(this);
                System.out.println("Musteri " + (musteriId + 1) + " masa " + (masaid + 1) + " ye oturdu--> " + currentThread().getName());
                
                r.arayuz.icon(masaid);
               
                 
                
             
            } sayac++;
 
        }
    }

    
    public void cik() {
       
      r.Musteriler.get(musteriId).setCikti(true);
     System.out.println("Musteri " + (musteriId + 1) +" restoraný terk etti.--> " + currentThread().getName());
    }
    
    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public int getMasaid() {
        return masaid;
    }

    public void setMasaid(int masaid) {
        this.masaid = masaid;
    }

    public boolean isCikti() {
        return cikti;
    }

    public void setCikti(boolean cikti) {
        this.cikti = cikti;
    }

}
