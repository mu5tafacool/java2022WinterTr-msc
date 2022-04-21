package interviewQuestions2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {

        System.out.print("***** 1 YOL *********\n");
        int sayi1 = 153;
        int num = sayi1;
        int i = 0;
        int toplam = 0;
        while (num > 0) {
            i = num % 10;
            toplam += Math.pow(i, 3); //sayinin kupu
            num /= 10;
        }
        if (toplam == sayi1) {
            System.out.println("Sayi dogru " + sayi1);
        } else {
            System.out.println("Sayi degil");
        }

        System.out.println("\n******* 2 YOL ************\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrong(sayi);
    }


    private static void armstrong(int n) { //n =153 rakam olarak sokuyoruz simge tanimi num sayi gibi degil
        int sayininKupleriToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = n;

        while (n > 0) {
            basamaktakiSayi = n % 10;
            sayininKupleriToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            n = n / 10;              //Math.pow(basamaktakiSayi, 3)
        }

        if (girilenSayi == sayininKupleriToplami)
            System.out.println(girilenSayi + " sayisi armstrong sayidir");
        else System.out.println(girilenSayi + " sayisi armstrong sayi degildir");

    }

    //soru 2 icin
    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            armstrong(i); //recursive method uyguladik
        }
    }
}