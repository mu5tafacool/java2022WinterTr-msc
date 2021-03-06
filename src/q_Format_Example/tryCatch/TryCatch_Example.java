package src.q_Format_Example.tryCatch;

import java.util.Scanner;

public class TryCatch_Example {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) { //islem dogru olana iken devam
            try {
                System.out.print("Vize giriniz: ");
                int num = scan.nextInt();
                if (num < 0 || num > 100) {//alinan scanleri 0 100 arasi kontrol
                    throw new ArithmeticException();
                } else System.out.println("islem tamam");
                break;
            } catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasında olmalıdır");
            } catch (Exception e) { //rakam degilde kelime girdiginde
                String str = scan.next();
                System.out.println("Hatalı giriş yaptınız.");
            }
        }


/** 2* yonetem *********************************/
        while (true) {
            try {
                System.out.print("\n2. yontem rakam gir : ");
                scan.nextInt(); //int sayi=scan.nextInt();
                //System.out.println("sayi = " + sayi);
                break; // dogruysa durdurmak icin
            } catch (Exception e) {
                String str = scan.next(); // devamli yazmamasi icin
                System.out.println(str+" rakam degil");
            }
        }

    }
}
