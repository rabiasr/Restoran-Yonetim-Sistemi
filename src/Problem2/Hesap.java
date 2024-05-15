package Problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Hesap {

    //public static ArrayList <>  = new ArrayList<>();
    public static int musteriSayisi = 0;

    public static ArrayList<Kazanc> kazanclar = new ArrayList<>();

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Müþteri Sayýsýný Giriniz: ");
        musteriSayisi = scan.nextInt();

        for (int masa = (musteriSayisi / 2); masa > 0; masa = masa / 2) {
            for (int garson = (masa / 2); garson > 0; garson = garson / 2) {

                for (int asci = (garson / 2); asci > 0; asci = asci / 2) {
                    if (garson % 2 != 0) {
                        garson = garson + 1;
                    }

                    islem(masa, garson, asci);

                }

            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("SONUÇLAR");
        Collections.sort(kazanclar, Comparator.comparingDouble(Kazanc::getKazanc).reversed());
        for (int i = 0; i < kazanclar.size(); i++) {
            System.out.println("liste: " + kazanclar.get(i).getKazanc());
        }

        System.out.println("En iyi kazanç için deðerler aþðýdaki gibidir:");
        System.out.println("Masa Sayýsý: " + kazanclar.get(0).getMasa());
        System.out.println("Garson Sayýsý: " + kazanclar.get(0).getGarson());
        System.out.println("Aþçý Sayýsý: " + kazanclar.get(0).getAsci());
        System.out.println("Kazanç: "+kazanclar.get(0).getKazanc());
        

    }

    public static void islem(int masa, int garson, int asci) {
        int sayac = 0;
        int siparis = masa;
        int gs = 0;
        int as = 0;
        int ms = 0;
        int gelensiparis = 0;
        int yemek = 0;
        int yedi = 0;
        int kasa = 0;
        int count = 0;
        boolean flag = false;
        while (count < musteriSayisi && !flag) {
            if (sayac == 20) {
                flag = true;
            }
            for (int i = 0; i < garson; i++) {

                if (masa > gelensiparis) {
                    gelensiparis++;
                    count++;
                    gs = 2;
                }

            }

            if (gs == 2) {
                sayac += 2;
                gs = 0;
            }

            for (int i = 0; i < asci * 2; i++) {
                if (gelensiparis > 0) {
                    gelensiparis--;
                    yemek++;
                    as = 3;
                }
            }

            if (as == 3) {
                sayac += 3;
                as = 0;
            }

            for (int i = 0; i < yemek; i++) {
                yedi++;
                ms = 3;
            }
            yemek = 0;

            if (ms == 3) {
                sayac += 3;
                ms = 0;
            }

            for (int i = 0; i < yedi; i++) {
                kasa++;

            }
            if (yedi > 0) {
                sayac += (yedi - 1);
            } else {
                sayac += yedi;
            }
            yedi = 0;

        }

        int kazancc = kasa - masa - garson - asci;
        Kazanc kazanc = new Kazanc(asci, masa, garson, kazancc);
        System.out.println("---------------------------------------------------------");

        kazanclar.add(kazanc);
        System.out.println("masa: " + masa);
        System.out.println("garson: " + garson);
        System.out.println("asci: " + asci);
        System.out.println("kazanç: " + kazancc);

    }
}
