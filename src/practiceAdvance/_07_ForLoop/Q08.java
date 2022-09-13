package src.practiceAdvance._07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome (bastan ve sondan ayni olan) olup olmadigini kontrol eden bir program yazin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();

        String terstenCumle = ""; //bir konteyner atiyoruz buraya harfleri koymak icin

        for (int i = cumle.length() - 1; i >= 0; i--) {
            terstenCumle += cumle.charAt(i);
        }
        if (cumle.equals(terstenCumle)) {
            System.out.println("Cumle Polindrome");
        } else {
            System.out.println("Cumle Polindrome degil");
        }

    }

}

