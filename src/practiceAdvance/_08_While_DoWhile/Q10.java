package src.practiceAdvance._08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.


        Scanner scan = new Scanner(System.in);
        System.out.println("5 rakam gir : ");

        int enBuyuk = 0;
        int sayac = 0;

        while (sayac < 5) {
            int rakam = scan.nextInt();
            if (rakam > enBuyuk) { //rakam enbuyuk ten buyuk ise en buyuye ata degilse devam
                enBuyuk = rakam;
            }
            sayac++;

        }
        System.out.println("enBuyuk = " + enBuyuk);

    }
}


