package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;

        do {
            System.out.println("pozitif sayi girin \nbitirmek icin 0 a basin ");
            sayi= scan.nextInt();
            if (sayi<0){
                System.out.println("negatif sayi girilmez");
                sayacNegatif++;
            }else if (sayi>0){
                toplam+=sayi;
                sayacPozitif++;
            }
        }while (sayi!=0);
        System.out.println("yanlislikla girilen negatif sayi adeti : " + sayacNegatif);
        System.out.println("girilen pozitif sayi adeti: " + sayacPozitif);
        System.out.println("girilen sayilar toplami : " + toplam);

    }
}
