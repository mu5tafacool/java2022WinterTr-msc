package src.java_Batch_59_QA.day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=)

        int input = 9;
        int faktoryel = 1;
        for (int i = input; i >= 1; i--) {

            faktoryel *= i; //faktoriyel carpim seri carpim


        }
        System.out.println(input + "! = " + faktoryel);
    }


}
