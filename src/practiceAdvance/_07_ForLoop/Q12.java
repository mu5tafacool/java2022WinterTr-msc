package src.practiceAdvance._07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        int num = 4;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum+=i*i;
        }
        System.out.println("toplam = " + sum);

//mscool
        System.out.println("****************\nHALUK HOCA\n***************");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi; i++) {

            toplam = (i * i) + toplam;
            //toplam+=i*i;

        }
        System.out.println("Sayıların kareleri toplamı: " + toplam);
    }
}
