package Proje.KitapIsteme;

import java.util.ArrayList;
import java.util.Scanner;

public class KitabEkle {
    static Scanner scan = new Scanner(System.in);

    static ArrayList<EklenenKitaplar> kitapEkle = new ArrayList<>();


    public static void secimPaneli() {
        System.out.print("lutfen secim icin bir numara seciniz : ");
        String secim = scan.next();
        switch (secim) {
            case "1":
                kitapEkle();
                menu();
                secimPaneli();
                break;
            case "2":
                numaraBul();
                menu();
                secimPaneli();
                break;
            case "3":
                menu();
                secimPaneli();
                break;
            case "4":
                menu();
                secimPaneli();
                break;
            case "5":
                menu();
                secimPaneli();
                break;
            case "6":
                cıkıs();
                break;
            default:
                System.out.println("Yanlıs secim yaptınız... Tekrar deneyiniz.");
                secimPaneli();
                break;
        }


    }

    private static void cıkıs() {
        System.out.println("İyi gunler......");
    }

    public static void numaraBul() {
        System.out.println("------------NUMARA İLE KİTAP BULMA--------");
        System.out.print("Aramak istediginiz kitabın numarasını giriniz :");
        int arananNumara = scan.nextInt();

        for (int i = 0; i < kitapEkle.size(); i++) {
            if (kitapEkle.get(i).getKitapNo() == arananNumara) {

                System.out.println("ARADIGINIZ  KİTAP" +
                        "\nnumarası : " + kitapEkle.get(i).getKitapNo() + "" +
                        "\nismi : " + kitapEkle.get(i).getKitapAdı() + "" +
                        "\nyazarı : " + kitapEkle.get(i).getKitapYazar() + "" +
                        "\nfiyatı : " + kitapEkle.get(i).getKitapFiyati());
            }


        }


    }

    public static <EklenenKitaplar> void kitapEkle() {
        System.out.println("------------KITAP EKLEME--------");

        int count = 1000;

        while (true) {

            count++;

            System.out.print("Eklemek istediginiz kitabın adı : ");
            scan.nextLine();//dummy hayalet komut
            String ad = scan.nextLine().toUpperCase();


            System.out.print("Eklemek istediginiz kitabın yazarı : ");

            String yazarı = scan.nextLine().toUpperCase();


            System.out.print("Eklemek istediginiz kitabın fiyatı : ");
            String fiyat = scan.nextLine();


            Proje.KitapIsteme.EklenenKitaplar kitap = new Proje.KitapIsteme.EklenenKitaplar(count, ad, yazarı, fiyat);

            kitapEkle.add(kitap);
            System.out.println(kitapEkle);

            System.out.println("Eklemeyi bitirmek icin 0 a basınız \ndevam etmek icin 1 e basınız .....");

            int devam = scan.nextInt();
            if (devam == 0) {
                System.out.println("Kitap ekleme bitti.....");
                break;
            }


        }


    }


    public static void menu() {
        System.out.println("---------------------------------");
        System.out.println("              KİTAPCI            ");
        System.out.println("---------------------------------");
        System.out.println("1-kitap ekle" +
                "\n2-numara ile kitap goruntule" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitaplari listele" +
                "\n6-cikis");


    }


}
