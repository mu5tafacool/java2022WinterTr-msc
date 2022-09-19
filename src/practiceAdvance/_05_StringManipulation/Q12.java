package src.practiceAdvance._05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("email girin :");
        String email = scan.nextLine();


        if (email.contains("@")) {
            if (email.contains("gmail.com")) {
                System.out.println("email onaylandi");
            } else System.out.println("Lutfen gmail hesabinizi girin");
        } else System.out.println("gecerli bir email girin ");
//mscool
        System.out.println("********** HALUK HOCA *****************");

        if (!email.contains("@")) {
            System.out.println("gecerli bir email girin");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("email onaylandi");
        } else if (email.contains("@") && !email.endsWith("@gmail.com")) {
            System.out.println("Lutfen gmail hesabinizi girin");
        }

        System.out.println("************ 2.yol ***********");
        boolean control = email.contains("@");
        int index = email.indexOf("@");

        if (!control) {
            System.out.println("Gecerli bir email giriniz : ");
        } else if (email.substring(index + 1).equals("gmail.com"))
        //(email.substring(email.indexOf("@")+1).equals("gmail.com")) //yukardaki int index yapmadan
        {
            System.out.println("email onaylandi");
        } else
            System.out.println("Lutfen gmail hesabinizi girin");
    }

}
