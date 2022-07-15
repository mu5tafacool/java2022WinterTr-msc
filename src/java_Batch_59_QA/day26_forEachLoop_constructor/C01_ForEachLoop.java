package src.java_Batch_59_QA.day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 11};

        // elementleri for loop ile yazdiralim


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println("");

        // bunu for-each loop ile yapacak olursak
        // for-each loop'u calistirmak icin hedef bir collection vermeliyiz

        for (int each : arr //her bir integer getir sonra geleni yazdir
        ) {
            System.out.println(each + " ");
        }
        //avantaji: ondex baslangic ve bitis degeri gibi detaylara kalmadan colection dan tum elementleri getiri

        //devavantaji : index e bagli islem yapilamaz. orn. ilk ucu artir digerlerini dusur yapilamaz
        //toptan hepsini alip getirip yapiyor ayrintisiz
    }
}
