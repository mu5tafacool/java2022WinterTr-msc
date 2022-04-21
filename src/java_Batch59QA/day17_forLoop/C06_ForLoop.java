package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz

        char harf1='A';
        char harf2='z';

        for (char i = harf1; i <=harf2 ; i++) {
            System.out.print(i + " ");

        }

        // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdirin

        double baslangic=1;
        double bitis=2;
        double artis=0.2; //i artis kullanimi

        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.print(i + " ");
        }
    }
}
