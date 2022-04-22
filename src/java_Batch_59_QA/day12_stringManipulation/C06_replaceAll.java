package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //kullanicidan isim soyisim bilgisini alin
        //butun harfleri * yapalim

        Scanner scan=new Scanner(System.in);
        System.out.println("isim ve soy isim girin");
        String isimSoyisim= scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S", "*"));
        // \\S butun bosluk haricindekileri * a cevir



    }

}
