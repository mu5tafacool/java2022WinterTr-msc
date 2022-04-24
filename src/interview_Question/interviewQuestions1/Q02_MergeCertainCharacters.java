package src.interview_Question.interviewQuestions1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {

        System.out.println("**********1.Yol************");

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Bİr string giriniz :");
        String str1 = scan1.nextLine();
        System.out.print("Bir sayi giriniz :");
        int a = scan1.nextInt();

        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>(); //soru ici
        for (int i = 0; i < a; i++) {
            arr2.add(String.valueOf(str1.charAt(0)));//ilk karakteri atadik
            arr2.add(String.valueOf(str1.charAt(str1.length() - 1)));//son karakteri atadik
            //arr2 [a,f] gibi oldu
            arr2.add(i + 2, arr2.get(i)); //afafaafaf dort adet var ama onceden arr2 atama yapildigndan
            //ilk ve son [a,f] sonra i+1 sonra al [a,f] 0 inci indeksini

            arr1.add(i, String.valueOf(str1.charAt(0))); //String in char degerini aliyoruz ilk harfi yani
            arr1.add(i + 1, String.valueOf(str1.charAt(str1.length() - 1))); // en son degeri
            // i+1 ise onceki i atmasi bittikten sonra devam ediyor
            //a=3 ise i=0,i=1,i=2 indexlere arr1 atar
            //i+1 de aliyor onceki 0 sa 1 gibi
        }

        for (String each : arr1) {
            System.out.print("" + each);
        } //aaafff
        System.out.println("\nsoru cozum");
        for (String each : arr2) {
            System.out.print("" + each);
        }


        System.out.println("\n\n*************2.Yol**************");

        Scanner scan = new Scanner(System.in);
        System.out.print("Bİr string giriniz :");
        String str = scan.nextLine();

        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        // ilkSonHarf(str, sayi);

        System.out.println("girilen stringin ilk ve son harfinin istenen sayi kadar birlesik hali :" + ilkSonHarf(str, sayi));

    } //main Sonu

    private static String ilkSonHarf(String str, int sayi) {
        String string = str.substring(0, 1) + str.substring(str.length() - 1); //ea

        String output = "";

        for (int i = 1; i <= sayi; i++) { // ea dan kac tane yazacgim  eaeaea
            output += string; // b= b+s
        }
        return output;
    }

}
