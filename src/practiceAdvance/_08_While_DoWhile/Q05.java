package src.practiceAdvance._08_While_DoWhile;

import java.util.Scanner;

public class Q05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.


        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;

        do {

            toplam += sayi % 10; //% kalan olan birleri toplama ekliyoruz
            sayi = sayi / 10; //10 bolup birleri siliyoruz 234 olan 23 oluyor

            System.out.println("Basamağın Toplamı = " + toplam + " kalan sayı " + sayi);

        }
        while (sayi > 0);
        System.out.println("Toplam = " + toplam);
    }
}
