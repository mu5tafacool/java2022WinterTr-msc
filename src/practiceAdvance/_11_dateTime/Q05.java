package src.practiceAdvance._11_dateTime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q05 {

    public static void main(String[] args) {

       /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalTime a= LocalTime.now();
        System.out.println("a = " + a);

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2);

        d = d.minus(p);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f));

        LocalTime t= LocalTime.now();
        System.out.println("t = " + t);
        System.out.println(t.getNano()-a.getNano()); //iki islem arasindaki nano sn cinsinden fark

 /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/

    }
}