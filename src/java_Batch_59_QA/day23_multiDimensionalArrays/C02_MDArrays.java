package src.java_Batch_59_QA.day23_multiDimensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {

        //verilen multi dimensional array in tum elementlerin toplamini bulunuz
        int arr[][] = {{3, 1, 7,5}, {6, 10}}; //auther 2 elemente sahip birinci inner 4 ikinci inner in 2 elementi var

        int toplam = 0;

        // i yi 0 dan baslattik
        //sonra j 0 dan basliyacak arr i i=0 di arr[0]=4 element var
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { //i nin uzunluguna kadar gidicek

                toplam += arr[i][j];

            }
        }
        System.out.println("arraydeki elemenlerin toplami : " + toplam);
    }
}

