package src.practiceAdvance._10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {
        List<Integer> asalSayilar = new ArrayList<>();
        int sayi = 2;
        int sayac = 0;
        while (sayi < 100) {

            for (int i = 2; i <= sayi; i++) { //sayiya kadar i aliyoruz

                if (sayi % i == 0) { //sayi ile 2 arasindakileri i degerlerini sayiya tam bolunuyor ise sayac artiyor
                    sayac++; //sayi 6 icin i bolenleri 2 3 6 dir ve sayac i 3 tur
                }
            }

            if (sayac == 1) { //eger bir boleni yani sadece kendisine bolunuyor ise bu Asal sayidir
                asalSayilar.add(sayi);
            }

            sayi++;
            sayac = 0;
        }
        System.out.println(asalSayilar);
        System.out.println("100'e kadar olan asal sayilar ");
    }
}