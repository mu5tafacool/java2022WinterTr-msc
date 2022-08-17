package src.java_Batch_59_QA.day22_arrays;
import java.util.Arrays;
public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=10;
        int istenenSayi2=4;
        int istenenSayi3=9;

        
        // Eger Javadan hazir BinarySearch ile yapmak isterseniz
        // once sort methodunu kullanip, sonra binarySearch yapmaliyiz
        // binarySearch() bize istenen sayinin oldugu indexi verir
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi)); // -9
        System.out.println(Arrays.binarySearch(arr,istenenSayi2)); // 3
        System.out.println(Arrays.binarySearch(arr,istenenSayi3)); // 7 ilk 9 sirasi

        // eger olmayan bir elemnti aratirsak
        // Java bulamadigini gostermek icin - isareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir
    }
}