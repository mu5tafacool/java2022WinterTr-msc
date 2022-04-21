package JavaProjects.P02_javaBankATM.JavaBankMsc;

import java.util.ArrayList;
import java.util.Arrays;

public class BankControl {
    //Kullaniciya giriş için kart numarasi ve şifresini isteyin,
    // eger herhangi birini yanlis girerse tekrar isteyin.
    //        Kart numarasi aralarda boşluk ile girerse de eger
    //        doğruysa kabul edin.
    //        Kart numarasi ve sifre dogrulanirsa kullanicinin
    //        yapabileceği işlemleri ekrana yazdirin,

    static ArrayList<String> giris = new ArrayList<>(Arrays.asList("1 Bakiye sorgula",
            "2 para yatirma", "2 para çekme", "3 para gönderme",
            "4 sifre değiştirme", "5 cikis"));






 /*   int girisHakki = 3;

        while(true) { //pin girisini denemeler yapmak icin true ekliyoruz
        System.out.print("pin code  giriniz : ");
        String userPin = scan.nextLine();
        if (userPin.equals(BankClass.passW)) {
            System.out.println("gayet basarili");
            break;
        } else {
            System.out.println("hatali giris yapildi");
            girisHakki--;
            System.out.println("kalan deneme hakkiniz : " + girisHakki);
            if (girisHakki == 0) {
                System.out.println("agam hakkin kalmadi bekleme yapma dewamkeee :)");
                break;
            }
        }

    }
*/

}
