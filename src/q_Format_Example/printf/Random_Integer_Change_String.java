package src.q_Format_Example.printf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Random_Integer_Change_String {

    public static void main(String[] args) {
        Random rnd = new Random();
        List<String> idStr = new ArrayList<>(); //bos id listi

//ID atamalarinda kullanmak icin
        String a = String.valueOf((rnd.nextInt(100))); //Random integer olan sayiyi String e cevirme
        String b = String.valueOf((rnd.nextInt(100))); //Random integer olan sayiyi String e cevirme
        String c = String.valueOf((rnd.nextInt(100))); //Random integer olan sayiyi String e cevirme

        idStr.add(a);
        idStr.add(b);
        idStr.add(c);

        System.out.println("a,b,c = " + a+", "+b+", "+c);
        System.out.println("idStr = " + idStr);
    }
}
