package src.practiceAdvance._05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("4 harfli bir kelime girin :");
        String kelime = scan.nextLine();

        if (kelime.length() != 4) {
            System.out.println("yanlis karakter");
        } else
            System.out.print(kelime.substring(3));
        System.out.print(kelime.substring(2, 3));
        System.out.print(kelime.substring(1, 2));
        System.out.print(kelime.substring(0, 1));
//mscool
        System.out.println("\n****** Haluk HOCA ********");
        String str=kelime;
        if (str.length() != 4) {
            System.out.print("lütfen 4 karakterli kelime giriniz");
        } else {
            System.out.print("tersten kelime : "); //tersten kelime : amuc
            System.out.print(str.substring(3));
            System.out.print(str.substring(2, 3));
            System.out.print(str.substring(1, 2));
            System.out.print(str.substring(0, 1));

        }


    }
}
