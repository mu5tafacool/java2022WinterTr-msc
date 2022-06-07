package src.practiceAdvance._17_Set;


import java.lang.reflect.Array;
import java.util.*;

public class HashSet02 {
    public static <arr> void main(String[] args) {
/*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}

    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */
        String arr[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};

        ArrayList<String> list = listeCevirme(arr);


    }

    private static ArrayList<String> listeCevirme(String[] arr) {
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }

        System.out.println("set1 = " + set1);

        return null;
    }
}
