package src.java_Batch_59_QA.day45_interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c01 {
    public static <Interator> void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(4);
        liste.add(2);
        liste.add(1);
        liste.add(3);

        for (Integer each : liste
        ) {
            each += each + 2;
        }
        System.out.println("liste = " + liste);


        Iterator itr = liste.iterator();

    }
}
