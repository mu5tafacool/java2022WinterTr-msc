package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /**
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        int input=5;

        for (int i = 1; i <=input; i++) { //satir sayisini kontrol eden
                           //
            for (int j = 1; j <=i ; j++) { //sutun sayisini kontrol eden

                //nested for loop ya dikdortgen formatinda olabilir
                //veya ucgen formatinda olabilir dikdortgen istedigimizde iki loop icinde
                //en point belirleriz
                //ucgen seklinde vermek icin inner loop end point tini outer degiskene bagli yapariz

                System.out.print("* ");
            }
            System.out.println("");
        }




    }
}
