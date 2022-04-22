package interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class Q01_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};

        List<Integer> tekrarsizListe = new ArrayList<>(); //konteyner aliyoruz

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizListe.contains(arr[i])) { //konteynira attigimizdan burdan contains yapiyoruz
                tekrarsizListe.add(arr[i]);
            }
        }
        System.out.println(tekrarsizListe); //[1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]


        System.out.println("\n*************2 YOL SON RAKAM YOK????????*************");
        ArrayList<Integer> out = new ArrayList<>(); //konteyner

        for (int k = 0; k < arr.length; k++) {    //{1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10}
            for (int l = k; l < arr.length; l++) {//{1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
                if (arr[k] != arr[l] && !out.contains(arr[k])) {
                    System.out.print(arr[k]); //1234-256879
                    out.add(arr[k]); //output a ekle
                }
            }
        }
        System.out.println();
        System.out.println("out = " + out); //[1, 2, 3, 4, -2, 5, 6, 8, 7, 9]
    }


}
