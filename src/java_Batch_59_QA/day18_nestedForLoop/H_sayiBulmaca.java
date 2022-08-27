package src.java_Batch_59_QA.day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur


        Random r = new Random(); //random sınıfı
        int random = r.nextInt(10);
        System.out.println(random); //ipucu gosterme
        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int i = 0;

        while (!(tahmin == random)) {
            i++;
            System.out.print("Lutfen tahmininizi giriniz : ");
            tahmin = scan.nextInt();
            if (tahmin < random) {
                System.out.println("Lutfen sayiyi buyultunuz");
            } else if (tahmin > random) {
                System.out.println("Lutfen sayiyi kucultunuz");
            } else {
                System.out.println("Bravo " + i + ". tahminde dogru tahmin ettiniz :-) ");
            }

        }

    }

}
/*
            while (sayi != a) {
            System.out.println("Lütfen 100 e kdar olan bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi == a) {
                System.out.println("tebrikler tutulan sayı "+a +" idi. " + sayac+" kere tahminde doğru sayıyı buldunuz");
            }
            if (sayi  > a ) {
                System.out.println("Küçült");
            }
            if (sayi  <  a) {
                System.out.println("Büyült");
            }
            sayac++;
        }
 */

//mehmet hoca cozum****************
/*
public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        Scanner scan = new Scanner(System.in);
        int tahmin=0;
        int sayac=1;
        while (sayi != tahmin){
            System.out.println("Lutfen bir sayi giriniz");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi soylemelisin");
            } else if (tahmin<sayi){
                System.out.println("Daha buyuk bir sayi soylemelisin");
            }
            sayac++;
        }
        System.out.println("Tuttugum sayiyi " + (sayac-1) + " tahminde buldunuz");
 */