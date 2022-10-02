package src.Proje.P02_javaBankATM.JavaBankMsc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class BankRunner extends BankClass {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        JavaProjects.P02_javaBankATM.JavaBankMsc.BankControl pin = new BankRunner();
        System.out.println("sifre girin");
        String userpin = scan.next();

        System.out.println("userpin = " + userpin);
        System.out.println("pin = " + pin);


        BankRunner secimMenu = new BankRunner(); //obje olusturuyoruz
        System.out.print("1.Bakiye Sorgulama\n2.Para Yatırma\n3.Para Çekme\n4.Para Gönderme\n5.Şifre Değiştirme\n0.Çıkış\nişlem secçiminizi tuşlayınız : ");
        int s = scan.nextInt(); //eslestirmek icin yapildi

        secimMenu.setSecim(s);//bankClass gecmesi icin


        // System.out.println("s = " + s);
        // System.out.println("secimMenu = " + secimMenu);


    }
}



