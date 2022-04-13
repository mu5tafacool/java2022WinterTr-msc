package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {


        int arr[]={2,3,4,5,6,7,5,3,2,4,5};
        int istenmeyen=3;

        istenmeyenSil(arr,istenmeyen);
    }

    private static void istenmeyenSil(int[] arr, int istenmeyen) {

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[1]==istenmeyen) {
                sayac++;
            }
        }
        
        int arrYeni[]=new int [arr.length-sayac];

        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyen) {
                arrYeni[index]=arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(arrYeni));
    }
}
