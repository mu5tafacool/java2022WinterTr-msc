package src.q_Format_Example;

import java.util.*;

public class SansliSayi {

    /*
   Kullanici durdurana kadar sayi girecek ve sonra girilen sayilar random olarak, ilk once 1,sonra 2,sonra 3 ve s. sayi
   silinecek. En son kalan sayi sansli sayi olacak.
    */
    static Scanner scan = new Scanner(System.in);

    static List<Integer> sayilar = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.print("Sayi giriniz(cikmak icin \"x\") : ");
            try {
                int sayi = scan.nextInt();
                sayilar.add(sayi);
            } catch (InputMismatchException e) {
                String str = scan.next();
                if (str.equalsIgnoreCase("x")) {
                    break;
                } else {
                    System.out.println("sayi girmen lazim, akillim");
                }
            }


        }
        System.out.println(sayilar);
        System.out.println("var olan sayı adedi: " + sayilar.size());
        Collections.shuffle(sayilar);
        for (int i = 1; i < sayilar.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (sayilar.size() > i) {
                    Collections.shuffle(sayilar);
                    sayilar.remove(0);
                }
            }
            System.out.println("silinecek sayı adedi: " + i);
            System.out.println("var olan sayı adedi: " + sayilar.size());


        }
        Collections.shuffle(sayilar);
        int index = sayilar.size() - 1;
        for (int i = 0; i < index; i++) {
            Collections.shuffle(sayilar);
            sayilar.remove(0);

        }
        System.out.println("sansli sayi: " + sayilar);

    }
}
