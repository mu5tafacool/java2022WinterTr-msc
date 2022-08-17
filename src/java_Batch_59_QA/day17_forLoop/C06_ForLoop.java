package src.java_Batch_59_QA.day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz

        char harf1='A';
        char harf2='z';

        for (char i = harf1; i <=harf2 ; i++) {
            System.out.print(i + " ");
            //A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z
        }

        // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdirin

        double baslangic=1;
        double bitis=2;
        double artis=0.2; //i artis kullanimi

        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.print(i + " "); //
            // 1.0 1.2 1.4 1.5999999999999999 1.7999999999999998 1.9999999999999998
        }
    }
}
