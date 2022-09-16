package src.practiceAdvance._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
        System.out.print("Ehliyetiniz var ise -> 1 yok ise -> 0 yaziniz : ");
        int ehliyetiniz = scan.nextInt();
        if (ehliyetiniz == 0 || ehliyetiniz == 1) {
            if (ehliyetiniz == 0) {
                System.out.println("hizinizi sormadan ceza 200$");
            }

            System.out.println("hizinizi giriniz : ");
            int hiziniz = scan.nextInt();

            if (ehliyetiniz == 1) {
                if (hiziniz < 0) {
                    System.out.println("hiziniz negatif olamaz");
                } else if (hiziniz >= 55 && hiziniz < 75) {
                    System.out.println("Ceza 100 $'dır");
                } else if (hiziniz >= 75 && hiziniz < 85) {
                    System.out.println("Ceza 150 $'dır");
                } else if (hiziniz >= 85 && hiziniz <= 94) {
                    System.out.println("Ceza 320 $'dır");
                } else if (hiziniz >= 95) {
                    System.out.println("Ceza 500 $'dır");
                } else System.out.println("hiz sinirindasiniz hayirli yolculuklar");

            } else if (ehliyetiniz == 0) {
                if (hiziniz < 0) {
                    System.out.println("hiziniz negatif olamaz");
                } else if (hiziniz >= 55 && hiziniz < 75) {
                    System.out.println("Ceza 300 $'dır");
                } else if (hiziniz >= 75 && hiziniz < 85) {
                    System.out.println("Ceza 350 $'dır");
                } else if (hiziniz >= 85 && hiziniz <= 94) {
                    System.out.println("Ceza 520 $'dır");
                } else if (hiziniz >= 95) {
                    System.out.println("Ceza 700 $'dır");
                } else System.out.println("hiz sinirindasiniz fakat ehliyetiniz olmadigindan Ceza 200 $'dır");

            } else System.out.println("ehliyet var mi yok mu ki sende");

        } else System.out.println("ehliyetin var yok mu sakamisin");
    }
}