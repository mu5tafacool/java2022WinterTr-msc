package src.java_Batch_59_QA.day06_concatination_Operators;

public class C01_Concatination {
    public static void main(String[] args) {


        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;


        //java5guzel
        System.out.println(str1+sayi1+str2);

        //2guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53guzel
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);

        /* **********************
        Eger tamamen sayilardan olusan bir String varsa ve biz bunu int'a cevirmek istersek
        Integer.valueOf(str)


        bir sayiyi String'e cevirmek istersem
        ""+sayi
        ************************/

    }
}
