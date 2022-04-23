package interviewQuestions7;

import java.util.Arrays;
import java.util.Random;

public class Q04_CreateMethodWithArray {

    //    ||This Part Should be in Main Method||
    //
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //     -2-Create a method that prints the sum of an array
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing


    public static void main(String[] args) {

        int leng = 5;
        int arr[] = new int[leng];

        for (int i = 0; i < leng; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr)); //[8, 6, 3, 5, 7]

        String a = "";
        int sum = 0;
        int max = arr[0];

        for (int each : arr) { //TOPLAM sum ve String YAZDIRMA
            a += each + " ";
            sum += each; //toplamini alma

            if (max < each) { //MAX bulma
                max = each;
            }
        }
        System.out.print(a + " "); //  8  6  3  5  7
        System.out.println("\nsum = " + sum);//29
        System.out.println("max = " + max); //8



        System.out.println("\n***************2 YOL METHOD ILE *******************");
        Random rand = new Random();
        int [] sayilar =new int[5];

        for (int i = 0; i < sayilar.length;i++){
            sayilar[i] = rand.nextInt(10); //array in elemanlarina 0 -10 arasi sayi atamasi yapar
        }

        printArray(sayilar);
        printSum(sayilar);
        printMaxValue(sayilar);
    }

    public static void printMaxValue(int[] sayilar) {
        int maxDeger = sayilar[0];
        for (int i = 1; i < sayilar.length; i++){
            maxDeger = Math.max(sayilar[i],maxDeger); //i e max arasinda buyuk olani alir ve max a assign eder
        }
        System.out.println("maxDeger = " + maxDeger);
    }

    public static void printSum(int[] sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++)
            toplam +=sayilar[i];
        System.out.println("toplam = " + toplam);
    }

    public static void printArray(int[] sayilar) {
        for (int i =0; i<sayilar.length;i++){
            System.out.print(sayilar[i] + " ");
        }
        System.out.println();
    }
}