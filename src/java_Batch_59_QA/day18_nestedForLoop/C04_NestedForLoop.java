package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*


         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         yazdirin
         */
        int input=5;


        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //* * * * ile asagisi
        for (int i = 1; i <= input; i++) { //i <= input-1 de olabilir
            for (int j = 1; j <=input-i ; j++)
            //for (int j = input-i ; j >=1 ; j--)
            { //5-1 4 yildizdan itibaren yaziyoruz. bu iki cozumde oluyor


                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
