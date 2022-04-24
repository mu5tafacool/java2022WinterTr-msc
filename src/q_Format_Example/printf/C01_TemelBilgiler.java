package src.q_Format_Example.printf;

public class C01_TemelBilgiler {

    public static void main(String[] args) {
        int sayi = 123;
        String str = "Ahmet Bulutluoz";
        double dob = 1.0205030456;

        System.out.println(sayi + "-" + str + "-" + dob + "-");

        System.out.printf("sayi : %-10d, str: %-10.10S, dou : %-7.3f", sayi,str,dob);
        //sayi : 123       , str: AHMET BULU, dou : 1,021


    }
}