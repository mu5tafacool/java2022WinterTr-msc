package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {


        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]); //ilk inner arrayin 2 cisi 7
        System.out.println(arr[1][1]);//10
        System.out.println(arr[1][2]);//2

        //ilk inner array in tum elementlerini yazdirma
        System.out.println(arr[0]);//arr[0] bir array oldugunda direk yazilmaz
        System.out.println(Arrays.toString(arr[0])); //[3, 1, 7]
        System.out.println(Arrays.toString(arr)); //[[I@5b464ce8, [I@57829d67]

        //MDArray de tum elementleri yazdirmak istersek
        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]
    }
}
