package src.java_Batch_59_QA.day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); //[Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1, "seckin");
        System.out.println(isimler);//[Aykut, seckin, Ilker, Oguzhan]


        List<String> LogListesi = new ArrayList<>();

        LogListesi.add(isimler.set(2, "Cosmos")); //ilkeri aldi sonra cosmos yapti. sonra ilkeri log listesine arsive ekledi
        System.out.println(isimler); //[Aykut, seckin, Cosmos, Oguzhan]
        System.out.println(LogListesi); //[Ilker] Arsiv aktarma tutma
    }
}
