package src.practiceAdvance._05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ad ve soyad giriniz = ");
        String text = scan.nextLine();

        System.out.println(text.substring(0, (text.indexOf(" "))));
        System.out.println(text.substring(text.indexOf(" ")+1)); //bos indexten sonra +1 olandan yaz
        System.out.println((text.substring(text.indexOf(" "), text.length())).trim()); //ad ve soyadi ayri yazdirma
        //text teki " " olan index den text sonuna lenght tine kadar yaz sonra bunu kirp boslugunu
//mscool

        System.out.println("******** Haluk Hoca cozum **********");

        // Ahmet Yılmaz    substring(başlangıç index, e kadar - dahil değil)


        String ad = text.substring(0, text.indexOf(" "));
        String Soyad = text.substring(text.indexOf(" ")+ 1); //bos indexten sonra +1 olandan yaz

        System.out.println("ad = " + ad);       //ad = kader
        System.out.println("Soyad = " + Soyad); //Soyad = Esen
    }
}

