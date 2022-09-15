package src.practiceAdvance._08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("pin code  giriniz : ");
        int userPin = scan.nextInt();

        int systemPin = 1453;
        while (userPin != systemPin) { //esit olmadigi kosulda devam ediyor ta ki esit olana kadar
            System.out.println("*****   hatali giris yapildi *****");
            System.out.println("*****   agam bidaha dene *****");
            userPin = scan.nextInt(); //bunu scan donsun diye giriyoruz yani pin isteme bolumune basa gelsin
        }
        System.out.println("gayet basarili....");
    }
}

