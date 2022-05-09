package src.trial_Deneme;

import java.awt.List;
import java.util.*;

public class MapDeneme {


    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> sinifA = new ArrayList<>(Arrays.asList("ali", "veli", "hasan", "ece", "ata", "gul"));
        ArrayList<String> sinifB = new ArrayList<>(Arrays.asList("kaan", "can", "su", "sila", "nil", "lale"));


        map.put("A", sinifA);
        map.put("B", sinifB);

        System.out.println(map);


        System.out.println("listeme sinifi");
        Set<Map.Entry<String, ArrayList<String>>> mapSet = map.entrySet(); //set entry yapiyoruz yazdirma icin

        for (Map.Entry<String, ArrayList<String>> each : mapSet) {
            System.out.println(each.getKey() + " => " + each.getValue()); //A => [ali, veli, hasan, ece, ata, gul]

        }
        for (ArrayList<String> v : map.values()) {
            System.out.println("value = " + v);
        }
        System.out.println("_____MAP FOREACH ILE YAZDIRMA________");
        for (Map.Entry<String, ArrayList<String>> entryYeni : map.entrySet()) {
            System.out.println(entryYeni.getKey() + " " + entryYeni.getValue());

        }

        System.out.println("**********Lamnbda ile yazdirma degerleri**********");
        map.values().stream().forEach(t -> System.out.println(t + " ")); //[ali, veli, hasan, ece, ata, gul]
        // [kaan, can, su, sila, nil, lale]

        System.out.println("___________________________________");



        System.out.println("\n***************TC NO KAYIT *********************");
        Scanner scan = new Scanner(System.in);
        Scanner scanTc = new Scanner(System.in);
        String secim = "";
        HashMap<String, HashMap<String, String>> kisiListesi = new HashMap<>();

        HashMap<String, String> kisiBilgisi = new HashMap<>();
        KisiBilgisiClass kisiEkle; //klastan kisiEkle die obje yaptik
        do {

            System.out.print("Ad girin : ");
            String ad = scan.next();
            System.out.print("SoyAd girin : ");
            String soyisim = scan.next();
            System.out.print("Tel girin : ");
            String tel = scan.next();
            System.out.print("Adres girin : ");
            String adres = scan.nextLine();
            scan.next();//bunny
            System.out.print("Yas girin : ");
            String yas = scan.next();


            System.out.print("TC NO girin :");
            String tcNo = scanTc.next();

            kisiBilgisi.put("isim", ad);
            kisiBilgisi.put("soy ad", soyisim);
            kisiBilgisi.put("yas", yas);
            kisiBilgisi.put("Tel", tel);
            kisiBilgisi.put("adres", adres);

            kisiListesi.put(tcNo, kisiBilgisi);
            System.out.println();
            System.out.println("devam ise E");
            secim = scan.nextLine();

            kisiEkle = new KisiBilgisiClass(ad, soyisim, yas, tel, adres); //kisiekle objesine constructor degerleri atiyoruz


        } while (secim.equalsIgnoreCase("e"));
        System.out.println("kisiListesi = " + kisiListesi);
        System.out.println("kisiListesi = " + kisiEkle);
        scan.next();//bunny
        System.out.print("\nsorgulama icin tc no girin");
        System.out.println(kisiListesi.get(scan.nextLine()));



    }


}
