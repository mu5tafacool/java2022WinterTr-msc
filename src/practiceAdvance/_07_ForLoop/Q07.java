package src.practiceAdvance._07_ForLoop;

import java.util.Scanner;

public class Q07 {


     /*  TASK :
            Matrisin boyutunu kullanıcıdan okuyup.
            Sadece diyagonu (köşegeni) 1 olan ve
            diğer elemanları 0 olan bir kare matrisi ekrana bastırın.

           Ekran Çıktısı
            Bir sayı giriniz: 7
            1000000
            0100000
            0010000
            0001000
            0000100
            0000010
            0000001

            Bir sayi giriniz: 5
            10000
            01000
            00100
            00010
            00001
       */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi girin :");
        int num = scan.nextInt();


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++)
                if (i == j) { //esit ise buda zaten diyagonal kosede oluyor 1 yaz else ise 0
                    System.out.print(1);
                } else System.out.print(0);
            System.out.println();
        }
//mscool
        System.out.println("******************\nHALUK HOCA\n******************");
        Scanner scan1 = new Scanner(System.in);
        System.out.print("pozitif bir tam sayı giriniz : ");
        int sayi = scan.nextInt();

        for (int baba = 1; baba <= sayi; baba++) {//satır kontrolu
            for (int ogul = 1; ogul <= sayi; ogul++) {//sutun kontrolu
                if (baba == ogul) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                System.out.println();
            }
        }
    }
}

