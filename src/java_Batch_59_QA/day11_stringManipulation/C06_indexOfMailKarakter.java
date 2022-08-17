package src.java_Batch_59_QA.day11_stringManipulation;

import java.util.Scanner;

public class C06_indexOfMailKarakter {
    public static void main(String[] args) {

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen mailiniz yazin");
        String mail= scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        } else{
            System.out.println("mailiniz kabul edildi");
        }
        // OZET : indexOf method'u icierise yazilan String veya char'in
        // metinde hangi index'de oldugu bize dondurur
        // eger aradigimiz metin veya char yoksa , olmadiginin delili olarak
        // bize -1 dondurur
    }
}
