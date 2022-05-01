package src.q_Format_Example.tryCatch.Methods;

import java.util.Scanner;

public class TryCatch_Integer_Method {


    static Scanner scan = new Scanner(System.in);

    public static int intGirisi() {
        int choice = 0;
        while (true) {
            try {
                choice = scan.nextInt();
                break;
            } catch (Exception e) {
                String str = scan.next();
                System.out.print("Harf degil rakam girin :");
                //burda eger tekrar secim menusun gormek icin
                // TryCatch_CallClassinda method yazilabilir
                // islemlerMenu ()
            }
        }
        return choice;
    }
}