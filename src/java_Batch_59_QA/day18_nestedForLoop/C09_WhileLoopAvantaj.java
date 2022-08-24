package src.java_Batch_59_QA.day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;


        //kullanicidan sifre istemelerde while kullanilir
        while (toplam<500){
            System.out.println("lutfen bir sayi girin");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("toplam : "+toplam);
    }
}
