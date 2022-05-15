package src.java_Batch_59_QA.day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("lutefen cinsiyetinizi girin " +
                "\nkadin icin K \nerkek icin E");

        char cinsiyet=scan.next().toUpperCase().charAt(0);
        //once cinsiyeti aliyoruz sonra buyutuyoruz
        // sonra char a ilk harfi atiyoruz

        System.out.println("lutfen yas girin");
        double yas= scan.nextDouble();

             //kadinlar icin
        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("girdiginiz yas degeri kotrol edin");
            } else if (yas<60){
                System.out.println("emekli olamazsin \nDaha " + (60-yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

            //erkekler icin
        } else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("girdiginiz yas degeri kotrol edin");
            } else if (yas<65){
                System.out.println("emekli olamazsin \nDaha " + (65-yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else{
            System.out.println("cinsiyet icin gecerli olan harf girmediniz");
        }

    }
}
