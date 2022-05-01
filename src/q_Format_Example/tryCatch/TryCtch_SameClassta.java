package src.q_Format_Example.tryCatch;

import java.util.Scanner;

public class TryCtch_SameClassta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        while (true) {
            try {
                input = Integer.parseInt(scan.next());  //integer giris yapilana kadar while
                break;
            } catch (Exception e) {
                System.out.println("Lutfen bir rakam tuslayin");
            }
        }
       /*
       switch (input) {
            case 1:
                scan.nextLine();
                urunTanila();
                depoGiris();
                break;

            case 2:
            *
            *
            *
            *
            */
        }
    }
