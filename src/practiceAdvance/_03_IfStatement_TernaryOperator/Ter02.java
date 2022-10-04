package src.practiceAdvance._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("karakter girin :");
        char ch = scan.nextLine().charAt(0);

        String result = (ch >= 'a' && ch <= 'z') ? "Kucuk Harf" : (ch >= 'A' && ch <= 'Z') ? "Buyuk Harf" : "Harf degil";

        System.out.println(ch + " : " + result);



        System.out.println("*****  TERNARY çözümü  HALUK *****");

        String result1 = ((ch <= 'z' && ch >= 'a') || (ch >= 'A' && ch <= 'Z')) ?
                ((ch <= 122 && ch >= 97) ? "Kucuk Harf" : "Buyuk Harf") : "Harf Degil";

        System.out.println(result1);

        System.out.println("*****  if  çözümü  *****");

        if ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A')) {
            if (ch <= 122 && ch >= 97) {
                System.out.println("küçük harf");

            } else System.out.println("Büyük harf");

        } else System.out.println("Harf değil");
    }
}

