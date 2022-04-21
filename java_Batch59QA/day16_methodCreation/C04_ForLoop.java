package day16_methodCreation;

public class C04_ForLoop {

    public static void main(String[] args) {
        // verilen string'i tersten yazdiran bir kod yaziniz

        String str="ya bu java cok zevkli";
        for (int i = str.length()-1; i >=0 ; i--) {

            //print olursa tersten yazdiriyor
            //println olursa alt alta yazdiriyor
            System.out.print(str.substring(i,i+1)); //her atanan i den sonraki i ye

        }

    }
}
