package JavaProjects.Manav;

public class QuestManav extends ManavInformation {


    public static void main(String[] args) throws InterruptedException {
        //throws InterruptedException Class parent class da bekleme methodu calismasi icin

        System.out.println(urunler);
        System.out.print("Alicaginiz urun : ");

        int mSecim = scan.nextInt();
        urunHesaplama(mSecim, urunler);


//tek problem harf girildiginde
        /***** Alternatif
         int mSecim = 0;
         try {
         mSecim = scan.nextInt();
         }  catch (InputMismatchException e) {

         }
         urunHesaplama(mSecim, urunler);
         ******/
    }

}