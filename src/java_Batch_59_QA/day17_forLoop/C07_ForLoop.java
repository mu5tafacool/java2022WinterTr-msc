package src.java_Batch_59_QA.day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        //Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
        //        1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //      - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //      - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        //      - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.


        int sayi=60;
        for (int i = 0; i < sayi; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("Java Guzeldir ");
            } else if (i%5==0){
                System.out.print("guzeldir ");
            } else if (i%3==0){
                System.out.print("Java ");
            } else System.out.print(i + " ");
        }
    }
}
