package src.practiceAdvance._12_Varargs;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String str1 = "m";
        String str2 = "e";
        String str3 = "r";
        String str4 = "v";
        String str5 = "e";

        birlestirme(str1, str2, str3, str4, str5);
    }

    private static void birlestirme(String... str) {
        String sonuc = "";

        for (String each : str
        ) {
            sonuc += each;
        }
        System.out.println("Harflerin birlesimi = " + sonuc);

    }
}


