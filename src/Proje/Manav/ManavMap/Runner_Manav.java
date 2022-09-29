package src.Proje.Manav.ManavMap;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Runner_Manav extends Islemler_Manav {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Sebzeler sebzelerClass = null;

        System.out.println(sebzelerClass.urunlerList);
        System.out.print("Alicaginiz urun : ");


        //  int mSecim = scan.nextInt();
        //  urunHesaplama(mSecim, urunler);


        while (true) { //try catch de devam eden dongu harf veya sayiya duyarli
            try { //harf girildiginde hata vermeden devam eden while dongusu
                int menuSecim = scan.nextInt();
                sebzeHesaplama(menuSecim);
            } catch (InputMismatchException e) {
                String str = scan.next(); //bunu devamli yazmasini engellemek icin koyuyoruz
                System.out.println("sayi girmen lazim... \n" + sebzelerClass.urunlerList);
            }
        }
    }


}
