package src.java_Batch_59_QA.day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_leght {
    public static void main(String[] args) {


        // Kullanicidan ismini alip basharfini ve son harfini Buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isim girin");
        String isim = scan.nextLine();

        //once ismi aliyor sonra yerel dil harf buyuk olunca bozulmamasi
        //icin tr ceviriyor.
        // ikincide ise alinan isim uzunlugundan en son harfi aliyor > isim.length()-1)
        System.out.println("ilk harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length() - 1));

        //bosluk bile "" 0 karakter dir
        String str1 = "";
        System.out.println(str1.length());

        //String str2= null;
        //System.out.println(str2);
        //String str3=;
        //System.out.println(str3);
        // System.out.println(str3);

        // str3 ile str2'ye deger atanmamistir
        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3' e bir deger atamasi olmayinca java altini kirmizi cizer
        // ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez


    }
}
