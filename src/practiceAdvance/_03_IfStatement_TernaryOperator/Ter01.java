package src.practiceAdvance._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi girin :");
        int sayi = scan.nextInt();

        //>10 kosulu : evet ise pztf :degil kosulunda 10-0 arasinda? rakam:degil ise negatif
        String result = sayi >= 10 ? "Pozitif Sayi" : (sayi < 10 && sayi >= 0) ? "Rakam" : "Negatif Sayi";
        System.out.println("result = " + result);


        System.out.println("*****  TERNARY çözümü HALUK *****");

        String result1 = (sayi >= 0) ? (sayi < 10 ? "rakam" : "pozitif sayı") : ("negatif sayı");
        System.out.println(result1);


        System.out.println("*****  if  çözümü  *****");

        if (sayi >= 0) {
            if (sayi < 10) {
                System.out.println("rakam");

            } else System.out.println("pozitif sayı");

        } else System.out.println("negatif sayı");

    }
}
