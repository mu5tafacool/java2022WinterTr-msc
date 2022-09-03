package src.practiceAdvance._12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int a = 2;
        int b = 4;
        int c = 5;
        int d = 6;
        int s = 4;
        int w = 1;

        topla(a, b, c, d, s, w);

    }

    public static void topla(int carpilacakSayi, int... toplanacakSayilar) {

        for (int each : toplanacakSayilar
        ) {
            System.out.println("toplanacakSayilar = " + toplanacakSayilar);
        }
    }
}
