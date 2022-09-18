package src.practiceAdvance._06_Method_Creation;

import java.util.Scanner;

public class Q10_ucKatiKontrol__ {
    public static void main(String[] args) {

        /*int bolen=9;
        Math.sqrt(bolen);
        System.out.println("bolen = " + bolen);
        System.out.println("Math.sqrt(bolen)= " + Math.sqrt(bolen));
        */

        System.out.println("(Math.sqrt(81)) = " + (Math.sqrt(81)));
        System.out.println("(Math.sqrt(27)) = " + (Math.sqrt(27)));
        System.out.println("(int) Math.sqrt = " + (int) Math.sqrt(27));
        System.out.println("(Math.sqrt(9)) = " + (Math.sqrt(9)));
        System.out.println("(Math.sqrt(2)) = " + (Math.sqrt(2)));

        Scanner scan = new Scanner(System.in);
        System.out.println("gir rakam : ");
        int number = scan.nextInt();

        System.out.println(uckademekontrol(number));
    }

    private static boolean uckademekontrol(int number) {

        boolean b = false;
        int carpim = 1;
        int sayac = 0;

        for (double i = number; i > 1; i--) {
            (i) =  Math.sqrt(i);
            sayac++;
            System.out.print("number = " + number + " ");
            System.out.println("i> " + i + " (int) Math.sqrt(i) " + (int) Math.sqrt(i));
            if (sayac == 3 && i * i * i == number) {
                System.out.println("uc katli rakam = " + number);
            }

        }
        return b;
    }
}
