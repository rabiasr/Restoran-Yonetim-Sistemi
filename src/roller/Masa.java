package roller;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Masa {

    private int masaId;
    private int durum;
    private Lock lock;
    private int musId = -1;
    private int asciId=-1;
    private int garsonId=-1;
    public Masa(int masaId) {
        this.masaId = masaId;
        this.durum = 0;
        this.lock = new ReentrantLock();
        this.musId = musId;
        this.asciId=asciId;
        this.garsonId=garsonId;
    }

    public int getMasaId() {
        return masaId;
    }

    public void setMasaId(int masaId) {
        this.masaId = masaId;
    }

    public int getDurum() {
        return durum;
    }

    public synchronized void setDurum(int durum) {
         lock.lock();
        try {
            this.durum = durum;
        } finally {
            lock.unlock();
        }
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public int getMusId() {
        return musId;
    }

    public void setMusId(int musId) {
        this.musId = musId;
    }

    public int getAsciId() {
        return asciId;
    }

    public void setAsciId(int asciId) {
        this.asciId = asciId;
    }

    public int getGarsonId() {
        return garsonId;
    }

    public void setGarsonId(int garsonId) {
        this.garsonId = garsonId;
    }
}
