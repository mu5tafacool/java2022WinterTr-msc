package src.practiceAdvance._05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        System.out.println(text.contains(" "));//direk yazdiriyoruz sonuc true
        boolean boslukVarMi = text.contains(" "); //atama yapiyoruz yazdirmak icin
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
        boolean bosMu = text.isEmpty();
        System.out.println("bosMu = " + bosMu); //bosMu = false
    }
}