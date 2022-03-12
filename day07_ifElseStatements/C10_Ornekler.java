package day07_ifElseStatements;

import java.util.Scanner;

public class C10_Ornekler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdorgenin a uzunlugunu girin");
        int aKenar= scan.nextInt();
        System.out.println("lutfen dikdorgenin b uzunlugunu girin");
        int bKenar= scan.nextInt();


        if (aKenar == bKenar){
            System.out.println("Girilen degerler KARE dir");
        } else if (aKenar<0 || bKenar<0){
            System.out.println("Girilen degerler NEGATİF deger olamaz");
        } else {
            System.out.println("Girilen degerler DİKDORTGEN dir");
        }

    }

}
