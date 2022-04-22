package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun

        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");


        int i=baslangic;
        while (i<=bitis){ //baslangic degeri bitis degerine esit ise bitir, degilse i yi yazdir ve bir ekle
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);  // 61
    }
}
