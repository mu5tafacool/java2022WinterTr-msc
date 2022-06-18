package src.Proje.Manav.ManavMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static src.Proje.Manav.ManavMap.Sebzeler.urunlerList;

public class Islemler_Manav {

    static double toplamOdeme;
    static double urunToplam;
    static String secim;
    static int miktarSecim;
    static String alinanUrunler = "";
    static Scanner scan = new Scanner(System.in);


    static HashMap<Integer, Sebzeler> manavMap = new HashMap<>();
    static List<Sebzeler> sebzeListesi = new ArrayList<>();

    //integer barkodu id si gibi
    //sebzeler ise urun ekleme islemi icin
    static void sebzeHesaplama(int menuSecim) {
        switch (menuSecim) {
            case 1:
                scan.next();
                alma();
                secimPanel();
                break;
            case 10:
                scan.next();
                ekleme();
                secimPanel();
                break;
            case 2:
                break;
            default:
                System.out.println("tekrar dene");

        }

    }

    protected static void alma() {
        Domates dAlma = new Domates();//methoduna ulasmak icin obze olusturudk
        double kg1 = 0;
        System.out.println(urunlerList);
        //"Domat  - urun kodu : 1", "Elma   - urun kodu : 2", "Muz    - urun kodu : 3",
        //"Biber  - urun kodu : 4", "Patlcan - urun kodu : 5", "Urun eklemek icin : 10", "Cikmak icin : 0"
        int a = scan.nextInt();
        switch (a) {
            case 1:
                //s = 1;
                kgIstegi(); // icin hem hesapda kg istekde
                hesap(kg1); //kg1 i herbir methodda gozukmesi icin eklenmesi
                System.out.println("kg1 = " + kg1);
                // dAlma.hesaplama();
                scan.next();

                break;
        }

    }

    private static void hesap(double kg1) {
        Sebzeler hesap1 = new Sebzeler();
        urunToplam += kg1 * hesap1.getDomatesFiyat();
        System.out.println("urunToplam = " + urunToplam);
    }

    private static void kgIstegi() {
        Sebzeler kgIstek = new Sebzeler();
        System.out.println("kac Kilo" + kgIstek);
        double kg1 = scan.nextDouble();
        System.out.println("kg1 kgistek= " + kg1);

    }

    private static void ekleme() {
        System.out.print("urun adi yazin: ");
        String ad = scan.nextLine();
        System.out.print("urun fiyati yazin: ");
        Double fyt = scan.nextDouble();
        Sebzeler yeniSebze = new Sebzeler(ad, fyt);
        sebzeListesi.add(yeniSebze);
        System.out.println("yeniSebze = " + yeniSebze);
        //ekliyor yalniz ayri consructurda
        System.out.println("sebze adieniii = " + yeniSebze.getYeniUrunAdi() + " fiyati " + yeniSebze.getYeniUrunFiyati() + "TL");

    }

    private static void secimPanel() {
        System.out.println("secim devam: D\nhayirsa H:");
        String sc = scan.nextLine().toLowerCase();
        if (sc.equalsIgnoreCase("d")) {
            sebzeHesaplama(scan.nextInt());
        } else {
            System.out.println("cikissss");
        }
    }


}
