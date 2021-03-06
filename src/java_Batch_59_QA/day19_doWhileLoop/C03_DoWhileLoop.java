package src.java_Batch_59_QA.day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip
        // while loop ile sayidan kucuk pozitif tamsayilari yazdiralim

        int input = 5;


        int sayi = 1;

        while (sayi < input) {
            System.out.println(sayi);

            sayi++;
        }
        System.out.println("\n*******************\ndo while loop calismasi\n*******************");
        // kullanicidan alinan degerde ilk kontrol yapildigini gormek icin yapiliyor
        // kullanicidan alinan deger icin kullanilir ve sonra kontrol etmek icin kullaniliyor
        sayi=1;
        do {
            System.out.println(sayi); //once sayiyi yazdiriyor
            sayi++; //sonra artiriyor
        }while (sayi<input); //sonra konrol ediyor ve dogruysa basa geciyor
    }
}
