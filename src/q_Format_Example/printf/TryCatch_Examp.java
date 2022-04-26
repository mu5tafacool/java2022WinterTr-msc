package src.q_Format_Example.printf;

import java.util.Scanner;

public class TryCatch_Examp {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) { //islem dogru olana iken devam
            try {
                System.out.print("Vize giriniz: ");
                if (scan.nextInt() < 0 || scan.nextInt() > 100) { //alinan scanleri 0 100 arasi kontrol
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasında olmalıdır");
            } catch (Exception e) { //rakam degilde kelime girdiginde
                String str = scan.next();
                System.out.println("Hatalı giriş yaptınız.");
            }
        }


    }
}
