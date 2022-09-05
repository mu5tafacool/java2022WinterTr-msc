package src.practiceAdvance._09_Arrays;

import java.util.Arrays;

public class Q04 {

    public static void main(String[] args) {
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;

        toplameForEachIleEitleme(arr, istenenToplam);


        for (int i = 0; i < arr.length; i++) {//arr kontrolu
            for (int j = i + 1; j < arr.length; j++) {//sorunun trick
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ile " + arr[j] + " toplamı : " + istenenToplam);

                }
            }

        }

    }

    private static void toplameForEachIleEitleme(int[] arr, int istenenToplam) {

        for (int each1 : arr
        ) {
            for (int each2 : arr
            ) {
                if (each1 + each2 == istenenToplam) {
                    System.out.println(each1 + "+" + each2 + "=" + istenenToplam);
                }
            }
        }
        System.out.println("\n***** 2 YOL ********");
        //mscool
    }

}
