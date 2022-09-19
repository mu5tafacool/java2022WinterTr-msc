package src.practiceAdvance._07_ForLoop;

import java.util.Scanner;

public class Q11 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
                                                28 496 8128
                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {

        int sayi = 8128;

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
                toplam += i;

            }

        }
        if (toplam == sayi) {
            System.out.println("\nsayilar toplamina esit = " + sayi);
        }
        System.out.println("toplam = " + toplam);
    }


}
