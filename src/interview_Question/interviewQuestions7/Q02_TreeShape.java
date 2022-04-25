package src.interview_Question.interviewQuestions7;

import java.util.Scanner;

public class Q02_TreeShape {
    // * yildiz sourusu
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken
    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("agacin tac uzunlugunu giriniz :");
        int tacUzunluk = scan.nextInt();
        String yaz = ""; //bu degiskeni tanimladik , for loop icinde kullanmak icin
        for (int i = 0; i < tacUzunluk; i++) {
            yaz += "^"; //bu kod satiri sayesinde nested for loop a ihtiyac duymadan yazdik
            System.out.println(yaz);
        }

        for (int i = 0; i < 5; i++) //govde sabit sayi oldugundan kendimiz  i <5 kimini yazdik
            System.out.println("|||");


        System.out.println("\n*************2 YOL*****************");

        int num = tacUzunluk;

        for (int i = 0; i <= num; i++) {
            for (int j = num; j >= i; j--) { //     ^  ilk satirda 5 bosluk var sonra azaliyor
                //     ^^   ikincide 4 bosluk

                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {

                System.out.print("^ ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) { //satir ekleme " " olarak 5 adet satir ekliyoruz govdeye
            for (int j = 0; j < num-1; j++) { //sutun " |||" bu bolumun konacagi sutun girilen sayinin bir eksigi agacin ortasinda yani
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {

                System.out.print("|||");
            }
            System.out.println();
        }
    }

}