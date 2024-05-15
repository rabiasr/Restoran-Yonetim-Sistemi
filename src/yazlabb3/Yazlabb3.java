package yazlabb3;

import Arayuz.arayuz;

import static java.lang.Thread.currentThread;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import roller.Asci;
import roller.Garson;
import roller.Kasa;
import roller.Masa;
import roller.Musteri;

public class Yazlabb3 {

    public static ArrayList<Musteri> Musteriler = new ArrayList<>();
    public static boolean mus = false;
    public static ArrayList<Garson> Garsonlar = new ArrayList<>();
    public static ArrayList<Asci> Ascilar = new ArrayList<>();
    public static ArrayList<Masa> Masalar = new ArrayList<>();
public static int suredoldu=10;
    public static int kalan=0;
    public static int bolum=0;
    public static int threadkes=0;
    
    public static arayuz arayuz = new arayuz();
    public static int o1;
    public static int n1;
    public static int o2;
    public static int n2;
    public static int o3;
    public static int n3;
    public static int o4;
    public static int n4;
    public static volatile boolean full6 = false;
    public static volatile boolean full = false;
    public static volatile boolean gecis = false;
    public static ArrayList<Masa> siparisBekleyenler = new ArrayList<>();
    public static ArrayList<Musteri> icerdekiler = new ArrayList<>();
    public static ArrayList<Masa> siparisler = new ArrayList<>();
    public static ArrayList<Kasa> kasaa = new ArrayList<>();
    public static int masa;

    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        System.out.println("1.adým öncelikli giriniz: ");
        o1 = scan.nextInt();
        System.out.println("1.adým normal giriniz: ");
        n1 = scan.nextInt();
        System.out.println("2.adým öncelikli giriniz: ");
        o2 = scan.nextInt();
        System.out.println("2.adým normal giriniz: ");
        n2 = scan.nextInt();
        System.out.println("3.adým öncelikli giriniz: ");
        o3 = scan.nextInt();
        System.out.println("3.adým normal giriniz: ");
        n3 = scan.nextInt();
        System.out.println("4.adým öncelikli giriniz: ");
        o4 = scan.nextInt();
        System.out.println("4.adým normal giriniz: ");
        n4 = scan.nextInt();
        liste();

        for (int i = 0; i < 3; i++) {
            Garson garson = new Garson(i);

            Garsonlar.add(garson);
        }

        for (int i = 0; i < 2; i++) {
            Asci asci = new Asci(i);
            Ascilar.add(asci);
        }
        for (int i = 0; i < 6; i++) {
            Masa masa = new Masa(i);
            Masalar.add(masa);
        }

        for (int i = 0; i < 3; i++) {

            Garsonlar.get(i).start();

        }

        for (int i = 0; i < 2; i++) {

            Ascilar.get(i).start();

        }
        Kasa kasa = new Kasa(1);

        kasaa.add(kasa);
        kasaa.get(0).start();

         bolum=(suredoldu/9);
        kalan=(suredoldu%9);
        if(kalan<6){
           threadkes=(bolum*6)+kalan+1;
        }
        if(kalan>6){
            threadkes=(bolum*6);
        }
        
        
        Simulasyon s = new Simulasyon();
        gecis g = new gecis();
        arayuz.setVisible(true);
        if (mus == true) {

            for (int i = 0; i < Musteriler.size(); i++) {
                Musteriler.get(i).start();

            }

            try {

                while (gecis == false) {

                    TimeUnit.SECONDS.sleep(2);
                    s.oturt(Masalar.get(masa));

                    if (icerdekiler.size() >= 6) {
                        full6 = true;
                    }
                    masa++;
                    if (masa >= 6) {
                        masa = 0;
                    }
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Yazlabb3.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        try {
            for (int i = 0; i < Musteriler.size(); i++) {
                Musteriler.get(i).join();
            }
            for (int i = 0; i < Garsonlar.size(); i++) {
                Garsonlar.get(i).join();
            }
            for (int i = 0; i < Ascilar.size(); i++) {
                Ascilar.get(i).join();
            }
            kasaa.get(0).join();
        } catch (InterruptedException e) {
            System.out.println("Simulation thread interrupted.");
        }

        System.out.println("simulasyon bitti");

    }

    public static void liste() {

        for (int i = 0; i < o1; i++) {

            Musteri musteri = new Musteri(i);
            currentThread().setPriority(1);
            musteri.setName(" 1.adým oncelikli " + i + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);

        }

        for (int i = o1; i < n1 + o1; i++) {

            Musteri musteri = new Musteri(i);

            currentThread().setPriority(10);
            musteri.setName(" 1.adým normal " + i + " thread" + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);

        }

        for (int i = n1 + o1; i < n1 + o1 + o2; i++) {

            Musteri musteri = new Musteri(i);

            currentThread().setPriority(1);
            musteri.setName(" 2.adým oncelikli " + i + " thread" + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);

        }

        for (int i = n1 + o1 + o2; i < n1 + o1 + o2 + n2; i++) {

            Musteri musteri = new Musteri(i);

            currentThread().setPriority(10);
            musteri.setName(" 2.adým normal " + i + " thread" + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);

        }

        for (int i = n1 + o1 + o2 + n2; i < n1 + o1 + o2 + n2 + o3; i++) {

            Musteri musteri = new Musteri(i);

            currentThread().setPriority(1);
            musteri.setName(" 3.adým oncelikli " + i + " thread" + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);

        }

        for (int i = n1 + o1 + o2 + n2 + o3; i < n1 + o1 + o2 + n2 + o3 + n3; i++) {

            Musteri musteri = new Musteri(i);

            currentThread().setPriority(10);
            musteri.setName(" 3.adým normal " + i + " thread" + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);
        }

        for (int i = n1 + o1 + o2 + n2 + o3 + n3; i < n1 + o1 + o2 + n2 + o3 + n3 + o4; i++) {

            Musteri musteri = new Musteri(i);

            currentThread().setPriority(1);
            musteri.setName(" 4.adým oncelikli " + i + " thread" + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);

        }
        for (int i = n1 + o1 + o2 + n2 + o3 + n3 + o4; i < n1 + o1 + o2 + n2 + o3 + n3 + o4 + n4; i++) {

            Musteri musteri = new Musteri(i);

            currentThread().setPriority(10);
            musteri.setName(" 4.adým normal " + i + " thread" + " thread----" + currentThread().getPriority());
            Musteriler.add(musteri);

        }
        mus = true;
    }

}
