package src.practiceAdvance._10_List;

import java.util.ArrayList;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr[] = {1, 2, 7, 4, 4, 3, 2, 1};
        boolean simetrik = false;
        System.out.println("arr = " + arr.length);
        for (int i = 0; i < arr.length / 2; i++) {//yarisini aliyoruz ki diger yarisi ile karsilastiriyoruz
            if (arr[i] == arr[arr.length - 1 - i]) { //arr.length - 1 - i bu her i degeri icin sondan azalarak ortaya gelir
                //arr[1]==arr[arr.8-1-1]; 8-1 > arr.length-1 son indextir yani indexler kiyasi 2 == 2 ...... arr[4]==arr[8-1-4]
                simetrik = true;
            } else {
                simetrik = false;
                break;
            }
        }
        System.out.println(simetrik);
    }
}