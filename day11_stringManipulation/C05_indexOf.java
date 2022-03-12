package day11_stringManipulation;
import java.util.Scanner;
public class C05_indexOf {
    public static void main(String[] args) {

        String str1= "Java bir baska guzel valla cok guzel";

        // istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str1.indexOf('J')); // 0

        // istersek bir harf ya da metin olarak verdigimiz String'in indexini dondurur
        System.out.println(str1.indexOf("l")); // 19
        System.out.println(str1.length()-1); // 35
        System.out.println(str1.indexOf("aska")); // 10

        // ayni harften birden fazla varsa ?
        System.out.println(str1.indexOf("b")); // 5 buldugu ilk dogru eslesmenin indexini dondurur
        //
        System.out.println(str1.indexOf('b', 6));
        // bu method'da java aramaya fromIndex olarak yazdigimiz index'den baslar
        //ve sonuc 6dan itibaren 9 cikar baska kelimesi
        // (inclusive)

        // verilen String'deki 2.a harfinin index'ini bulalim
        int ilkindex= str1.indexOf('a');// 1
        System.out.println(str1.indexOf('a',ilkindex+1)); // 3

        // verilen String'deki 2.b harfinin index'ini bulalim
        //"Java bir baska guzel valla cok guzel"
        int ilkbindex= str1.indexOf("b");// 5
        System.out.println(str1.indexOf("b",ilkbindex+1)); // 9

        // 20. index'den sonra guzel aratalim
        //"Java bir baska guzel valla cok guzel"
        System.out.println(str1.indexOf("guzel", 20)); //31

        // String'de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type'i index
        // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir




    }
}