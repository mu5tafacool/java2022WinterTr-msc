package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Ternary ile yapilan tum islemler if else ile de yapilabilir
        // If else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        // Ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir
        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif tamsayi girin");

        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");
        } else {
            System.out.println("sayi tek");
        }


        //Ternary yazimi
        System.out.println(sayi%2==0 ? "sayi cift with Ternary" : "sayi tek with Ternary");
    }
}
