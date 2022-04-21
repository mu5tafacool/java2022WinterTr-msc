package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın.
        // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan=new Scanner(System.in) ;
        System.out.println("lutfen 4 basamakli bir tamsayi girin");
        int sayi= scan.nextInt();


        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamakli sayi girin");
        } else if (sayi%5==0) { //sayi 5 e tam bolunur
            System.out.println();
            if (sayi%10==0){ //4 basamakli 5 ile bolunebilen ve son rakami o olan
                System.out.println("5 e bolunebilen cift sayi");
            } else { //4 basamakli 5 ile bolunebilen ve son rakami 0 olmayan
                System.out.println("5 e bolunebilen tek sayi");
            }

        } else { //4 basamakli 5 e bolunemeyen
            System.out.println("tekrar deneyin");
        }
    }
}
