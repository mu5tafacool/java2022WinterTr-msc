package src.java_Batch_59_QA.day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {


        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));


        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca " + str.substring(5));

        System.out.println(str.substring(9));
        // yazilan index inclusive
        // Eger bir index'den sona kadar olan parcayi degil
        // belirli bir parvcayi almak istersek
        // 2 parametre yazmak gerekir str.substring(baslangicIndexi, bitisIndexi)
        // baslangic indexi ==> inclusive/dahil
        // bitis indexi ==> eclusive/haric

        System.out.println(str.substring(0,5)); //Java 0 dan 5 olan karakter
        System.out.println(str.substring(0,1)); //J 0 dan 1e karakter

        //atama yaparak
        String harf=str.substring(5,6); //6. karakter String olarak bulmak
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7)); // hiclik verir cunku 7 aloyor ama 7 de bitireceginden

        //System.out.println(str.substring(5,2)); bitis indeksi baslangic indeksinden kucuk olamaz hataverir

        System.out.println(str.substring(str.length()-1)); //son harfi verir
        System.out.println(str.substring(str.length()-5)); //son 5 harfi verir
        System.out.println(str.substring(str.length())); //son harften sonra hiclik verir
    }

}
