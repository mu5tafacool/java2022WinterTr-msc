package src.practiceAdvance._07_ForLoop;

import java.util.Scanner;

public class Q24_$ {
    public static void main(String[] args) {
        /*
        Armstrong  sayı için rakamların küplerini alıp toplamıyormuşuz.
    Bir sayının Armstrong sayı olabilmesi için rakamların üstü sayıdakı basamak sayısı oluyor ve
    öyle toplanıyor. Toplam = Girilen sayı olursa bu Armstrong sayıdır.
    örnek: 1634 ... 1^4 =1, 6^4=1296, 3^4=81, 4^4 = 256 ... 1+1296+81+256 = 1634
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Armstrong kontrol icin bir sayi giriniz: ");
        String sayi = scan.next();
        String kontrol[] = sayi.split("");
        int toplam = 0;
        for (int i = 0; i < kontrol.length; i++) {
            toplam += Math.pow(Integer.valueOf(kontrol[i]), kontrol.length);
        }
        if (Integer.valueOf(sayi) == toplam) {
            System.out.println("Bu Armstrong sayidir.");
        } else System.out.println("Armstrong sayi degil");


        System.out.println("\n\n******* Sayilari bulma **********");
        // TODO Auto-generated method stub


        int yuzler,onlar,birler,toplam1;

        System.out.println("Armstrong Sayılar :");

        for(int i=100;i<10000;i++){


            yuzler=i/100;
            onlar=(i%100)/10;
            birler=i%10;

            toplam1= (int) (+Math.pow(yuzler,3)+Math.pow(onlar, 3)+Math.pow(birler, 3));//3 ussunu aliyoruz

            if(i == toplam1){

                System.out.print(i + " ");
            }

        }

    }
}
