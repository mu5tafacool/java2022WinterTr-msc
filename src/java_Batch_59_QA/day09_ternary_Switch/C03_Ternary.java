package src.java_Batch_59_QA.day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun
        // Ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable'a  atama yapabiliriz

        int sayi=-120;

        String sonuc =sayi>=100 ? "sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

        //Ternary bize sonuc dondurdugunden ya bu sonucu direk yazdirmali
        //ya da sonucun data turune uygun bir variable atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);
    }
}
