package day06_concatination_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8); // false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
                        //t &&  t &&      t && t ; true
        System.out.println(sonuc1); //true


        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
                        //t &&  f &&     t && t     ; false
        System.out.println(sonuc2);

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;

        //&& kisa cozum yapip saglıyor & sonuna kadar bakiyor



        int sayi3=15;

        //sayi3 10 ile 20 arasi oldugunu true olarak goster
        // 10<sayi3<20 uclu karilastirmalar yapmaz java
        // System.out.println(10<sayi3<20); OLMAZZZZ

        System.out.println(10<sayi3 && sayi3<20);


        int sayi4=5;
        //sayi4 10 20 arasinda olmadigini gosterin

        System.out.println(sayi4<10 || sayi4>20);
    }
}
