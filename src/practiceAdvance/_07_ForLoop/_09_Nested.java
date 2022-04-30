package src.practiceAdvance._07_ForLoop;

public class _09_Nested {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        int sayi = 1;
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <i; j++) {

                System.out.print(sayi++ + " ");
            }
            System.out.println();
        }


    }
}