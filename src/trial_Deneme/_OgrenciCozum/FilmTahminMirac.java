package src.trial_Deneme._OgrenciCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahminMirac {
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {
// static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));
        Scanner scan = new Scanner(System.in);
        String selectedFilm = "";

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.print("1-" + (film.size()) + " arasinda bir sayi giriniz : ");

        int wantedFilmNo = scan.nextInt() - 1;
        System.out.println("Seçtiğiniz filmde " + film.get(wantedFilmNo).length() + " harf var.");
        for (int i = 0; i < film.get(wantedFilmNo).length(); i++) {
            System.out.print("_" + " ");

        }
        System.out.println("");
        guessNameOfFilm(film.get(wantedFilmNo));

    }

    private static void guessNameOfFilm(String s) {
        int guessNumber = 2 * s.length(); // maksimum tahmin sayımız
        //tahmin edilen harfler seçilen filmde varsa, ekrana sadece o harflerin gözükmesi için
        //yeni bir String türünde array oluşturuldu.

        List<String> arr = new ArrayList<>();
        // for döngüsü ile doğru tahmin edilen harfler ekrana yazıldı
        for (int i = 0; i < s.length(); i++) {
            arr.add(i, "_");

        }

        int lastGuessNumber = 0;
        boolean guess = true;
        Scanner scan = new Scanner(System.in);
        while (guess) {
            System.out.println("Bir harf Tahmin ediniz : " + "( " + lastGuessNumber + " / " + guessNumber + " )");
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i) + " ");

            }
            System.out.println("");
            String letter = scan.next().toUpperCase();
            if (!s.contains(letter)) lastGuessNumber++;
            else {
                // for döngüsü ile doğru tahmin edilen harfler yeni oluşturulan Listin ilgili indexine eklendi
                for (int i = 0; i < s.length(); i++) {
                    if (s.split("")[i].equals(letter)) {
                        arr.set(i, letter);
                    }

                }
            }
            if (lastGuessNumber == guessNumber) {
                System.out.println("Tahmin hakkınız doldu ");
                System.out.println("Seçtiğiniz film : " + s + " idi");
                break;
            }
            if (!arr.contains("_")) {
                System.out.println("Tebrikler Bildiniz ");
                break;
            }
        }
    }
}
