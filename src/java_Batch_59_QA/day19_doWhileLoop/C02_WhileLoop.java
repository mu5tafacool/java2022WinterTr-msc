package src.java_Batch_59_QA.day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // ) Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin

        int input=4195;
        int rakam=0;
        int rakamlartoplami=0;

        while (input>0){
            rakam=input%10;//input u 10 buldugumuzde 5 cikiyor bunu rakama ekliyoruz
            rakamlartoplami +=rakam;//5 i rakamlar toplamina katiyoruz
            input/=10; //tekrar boluyoruz

        }
        System.out.println(rakamlartoplami);
    }
}
