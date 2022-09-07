package src.practiceAdvance._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.


        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
        System.out.println("X ve Y degerleri girin : ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x>0 && y>0 ){
            System.out.println("girdiginiz degerler 1. bolgeye ait");
        } else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 2. bolgeye ait");
        } else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 3. bolgeye ait");
        } else if (x>0 && y<0){
            System.out.println("girdiginiz degerler 4. bolgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");

        } else System.out.println("orijin uzerinde");

    }
}
