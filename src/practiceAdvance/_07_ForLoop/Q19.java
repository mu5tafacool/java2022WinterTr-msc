package src.practiceAdvance._07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) {
            for (int j = 5; j >=i ; j--) { //     *  ilk satirda 5 bosluk var sonra azaliyor

                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
//mscool
        System.out.println("\n\n**********HALUK HOCA***********");
        for ( int satir = 1; satir < 6; satir++) {//satır kontrolu

            for (int bosluk = 5- satir; bosluk > 1; bosluk--) {//bosluklari 4,3,2,1 tane yazdırmalıyım
                System.out.print(" ");
            }

            for (int yildiz =  1; yildiz <=satir; yildiz++) {//yıldız kontrolu
                System.out.print("* ");//"*" yapılırsa sağa dayalı üçgen olur
            }

            System.out.println();
        }
    }
}

