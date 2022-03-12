package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {

    public static void main(String[] args) {

        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz ? " +
                "\n Evet veya Hayir yaziniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katiliminiz onaylanmistir");
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " Sonraki derslemize bekleriz");
        } else {
            System.out.println("lutfen evet veya hayir yaziniz");
        }
    }
}
