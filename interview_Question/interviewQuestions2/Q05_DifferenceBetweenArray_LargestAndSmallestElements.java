package interviewQuestions2;

import java.sql.Array;
import java.util.*;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */


    public static void main(String[] args) {

        System.out.println("********* 1 YOL List <> ***************");

        List<Integer> list = new ArrayList<>();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("basamak verin: ");
        int ii = scan1.nextInt();
        for (int i = 0; i < ii; i++) {
            System.out.print("rakam alim :");
            list.add(scan1.nextInt());
        }
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("MIN = " + list.get(0));
        System.out.println("MAX= " + list.get(list.size() - 1));
        System.out.println("Fark= " + (list.get(list.size() - 1) - list.get(0)));


        System.out.println("\n********** 2 YOL arr[] ****************\n");

        arrayolustur();
    }

    private static void arrayolustur() {
        Scanner scan = new Scanner(System.in);
        System.out.print("array uzunlugu giriniz :");
        int uzunluk = scan.nextInt();
        int arr[] = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayin " + (i + 1) + ".elemanini giriniz :");
            arr[i] = scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("arr[son eleman]-arr[ilk eleman] : " + (arr[uzunluk - 1] - arr[0]));


    }
}

