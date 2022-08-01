package src.java_Batch_59_QA.day10_switch_StringManipulation;

import java.util.Arrays;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "java Cok guzel";

        //j yazdirmak icin 0 dan basladigindan
        System.out.println(str.charAt(0));

        //g yi yazdirmak icin =java Cok guzel 9. karakter
        System.out.println(str.charAt(9));

        //va yazdirmak "" ekliyoruz cunku harfleri toplamada rakama cevirir
        System.out.println("" + str.charAt(2) + str.charAt(3));

        //cOK seklinde yazdirma
        System.out.println(str.toLowerCase().charAt(5) +
                "" + str.toUpperCase().charAt(6) +
                str.toUpperCase().charAt(7));

        //son harfi yazdir
        System.out.println(str.charAt(14 - 1)); //uzunluk -1


        //stringteki kelimedeki harfleri rakamlardan ayirma cevirme
        //1.00₺
        // replaceAll("\\D","")); //100
        // replaceAll("[^a-zA-Z0-9.]","")); // ^ haric anlaminda // 1.00
        // replaceAll("[a-zA-Z0-9]","")); // harf ve rakamlari kapsiyor //


        String str1 = "ade1r4d3";
        String arr[] = str1.split("");
        System.out.println(Arrays.toString(arr));

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) { //harften rakamlari ayirma
                //karakter classindaki dijital method da
                // i array in 0 inci karakterinin al
                toplam += Integer.valueOf(arr[i]);
            }
        }
        System.out.println("string ifadenin sayi degerleri toplami : " + toplam);


    }
}
