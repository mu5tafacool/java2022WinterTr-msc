package src.java_Batch_59_QA.day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        // ve toplam kac tane olduklarini ekranda yazdirin

        int input=90;

        int bolen=1;
        int sayac=0;

        // for loop ile de yapabiliriz ama biz
        // while loop ile yapalim

        while (bolen<=input){ //1 den baslayacak kullanicin girdigi sayiya kadar yazacak

            if (input%bolen==0){//tam bolunuyor ise
                System.out.print(bolen + " "); //boluyorsa bunu yazdir
                // altta sayaca ekle onun altinda boleni arttir
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + " sayisini bolen " + sayac + " adet sayi vardir");
    }
}
