package day22_arrays;

public class C011_PiramitYapma {
    public static void main(String[] args) {


     /*
     harflerle pirmait yapma
               A
              BBB
             CCCCC
            DDDDDDD
           EEEEEEEEE
         */
        int n = 6;
        for (int i = 1, p = 'A'; i < n; i++, p++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p);
            }
            for (int j = 1; j < i; j++) {
                System.out.print((char) p);
            }
            System.out.println();
        }

        //sayilar ile piramit yapma

        int s = 6;
        for (int i = 1, p = 1; i < s; i++, p++) {
            for (int j = i; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((int) p);
            }
            for (int j = 1; j < i; j++) {
                System.out.print((int) p);
            }
            System.out.println();


        }
    }
}