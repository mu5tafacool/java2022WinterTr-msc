package src.java_Batch_59_QA.day03_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {


         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

            int sayi1= 30;
            int sayi2=20;
            System.out.println("Swaptan önce sayı1 : " + sayi1 + " " + "sayi2 : " + sayi2);
            sayi1= sayi1+sayi2;//sayı1=50
            sayi2=sayi1-sayi2;//sayı2=50-20=30
            sayi1=sayi1-sayi2;//sayı1=50-30=20
            System.out.println("Swaptan sonra sayı1 : " +sayi1 +" " + "sayı2 " +sayi2);
    }
}
