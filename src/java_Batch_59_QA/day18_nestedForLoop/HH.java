package src.java_Batch_59_QA.day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class HH {
    public static void main(String[] args) {

        int random = 10; //bulunmasi gereken rakam

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int i = 0;

        while (tahmin!=random){
            System.out.print("deger verin : ");
            tahmin= scan.nextInt();
            i++;
            if (tahmin==random){
                System.out.println("dogru deger : "+ random + " - " + i + " kadar tahmin");
            break; }
            if (tahmin<random){
                System.out.print("deger kucuk ");
            } else System.out.print("deger buyuk ");
        }
    }
}

