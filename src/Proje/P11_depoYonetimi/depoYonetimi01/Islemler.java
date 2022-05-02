package src.Proje.P11_depoYonetimi.depoYonetimi01;

import java.util.HashMap;
import java.util.Scanner;

public class Islemler {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static int id = 1000;
    static HashMap<Integer, Urunler> urunler = new HashMap<>();//urunleri depolanacagı bos map

    /**
     * 6* id ve urunler icin map objesi olusturduk. ama burda urunler bir obje olarak
     * (String urunIsmi, String uretici, int miktar, String birim, String raf) icinde constructordir
     */
    // {1001,"un ankara cuval 100 2a"}--> map element
    public static void girisPanel() {
        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-URUN TANIMLAMA  |            | 2-MİKTAR GUNCELLEME|  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-RAF GUNCELLEME  |            | 4-URUN CIKISI     |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN LİSTELE    |            | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int secim = scan.nextInt();
        /** 7* islemler den gelen scan i secim olarak switch olusturuyoruz */

        switch (secim) {
            case 1:
                urunTanımla();
                girisPanel();
                break;
            case 2:
                miktarGuncelle();
                girisPanel();
                break;
            case 3:
                rafGuncelleme();
                girisPanel();
                break;
            case 4:
                girisPanel();
                break;
            case 5:
                urunListele();
                girisPanel();
                break;
            case 6:
                cıkınızLutfen();
                break;
            default:
                System.out.println("adam gibi değer gir gelmiyin oraya");
                girisPanel();
                break;


        }

    }


    private static void urunListele() {
        System.out.println("****  Urun Listesi ****");
        System.out.println(urunler);
    }

    private static void cıkınızLutfen() {
        System.out.println("yine bekleriz");
    }

    private static void urunTanımla() {
        System.out.print("uruni ismini giriniz : ");
        String urunIsim = scan.nextLine();
        /** 8* Urunler(String urunIsmi, String uretici,
         * int miktar, String birim, String raf) istiyoruz bunlar constructor sirasiyla aliniyor*/

        scan.nextLine();
        System.out.print("uretici bilgisi giriniz : ");
        String uretici = scan.nextLine();
        // scan.nextLine();
        System.out.print("urun birimi giriniz : ");
        String birim = scan.nextLine();

        System.out.print("urun miktar giriniz : ");
        int miktar = scan.nextInt();
        scan.nextLine();
        System.out.print("urun icin raf giriniz : ");
        String raf = scan.nextLine();

        /** 9* alinan degerleri bir objeye atamaliyiz ve
         * bunlar urunler constructor dan olusturulan urun objesine ekleniyor*/
        Urunler urun = new Urunler(urunIsim, uretici, miktar, birim, raf);
        /** 10* obje olan bu urunu, map olan urunlere id si key olan,
         * variabla ise urun bilgileri seklinde put yapiyoruz */
        urunler.put(id, urun);
        System.out.println(id + " : " + urunler.get(id));
        id++;
        /** 11* alinan urunun id sinden sonra yeni urun icin bir artiriyoruz id yi*/


    }
    private static void miktarGuncelle() {
        /** 12* urunun miktari guncellemesi icin once urunun id istiyoruz ki map varible miktarini degistirelim*/
        System.out.print("miktar hüncelleyeceginiz urun id girniz : ");
        int arananId = scan.nextInt();
        if (urunler.keySet().contains(arananId)) {
            /** 13* aranan id urunler key id sinde bulunuyorsa
             * miktari al*/

            System.out.print("guncel miktarınızı girniz : ");
            int guncelMiktar = scan.nextInt();
            urunler.get(arananId).setMiktar(guncelMiktar + urunler.get(arananId).getMiktar());
            /** 14* alinan miktar urunlerin get edilen id sinde bagli olan miktari set etmesi, onceki getmiktar ile toplayarak */

            System.out.println("urun mikatrınız güncrl hale getirildi ");
        } else System.out.println("aradıgınız urun yok");


    }

    private static void rafGuncelleme() {
        System.out.print("raf hüncelleyeceginiz urun id girniz : ");
        int arananId = scan.nextInt();
        if (urunler.keySet().contains(arananId)) {

            System.out.print("guncel raf miktarınızı girniz : ");
            String guncelMiktar = scan.next();
            urunler.get(arananId).setRaf(guncelMiktar);

            System.out.println("urun raf güncrl hale getirildi ");
        } else System.out.println("aradıgınız urun yok");


    }

}
