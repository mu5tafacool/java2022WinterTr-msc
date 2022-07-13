package src.java_Batch_59_QA.day14_stringManipulation;

import java.util.Locale;

public class C02_TerstenYazdirma {

    public static void main(String[] args) {
        String input="Mavi";


        String tersStr=input.substring(3).toUpperCase() +    //i
                       input.substring(2,3).toLowerCase() +   //v
                       input.substring(1,2).toLowerCase() +   //a
                       input.substring(0,1).toLowerCase() ;   //m

        System.out.println(tersStr);
    }
}
