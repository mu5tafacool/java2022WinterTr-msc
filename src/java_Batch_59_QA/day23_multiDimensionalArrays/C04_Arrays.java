package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {


        //kullaniciya kac elementlik bir array olusturacagini sorun
        //array i olusturup elementleri kullanicidan alip array atayin


        Scanner scam= new Scanner(System.in);
        System.out.println("lutfen kac elentli bir arra istedini yazin");

        int uzunuk= scam.nextInt();

        int arr[]=new int[uzunuk];//5 yazilir ise [0,0,0,0,0]yazar

        for (int i = 0; i < uzunuk; i++) { //ilk aldigim indeksi ilkine
            System.out.println("Array icin " + (i+1) +" eleman girin");//bir fazla sayi diye i+1
            arr[i]= scam.nextInt();

        }
        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
    }
}
