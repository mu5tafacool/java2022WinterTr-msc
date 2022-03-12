package day17_forLoop;
public class C08_Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.


        String input="Java";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i); //her i degerini tersteninput a tanimla sirasiyle

        }

        System.out.println("girdiginz kelime : "+ terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){ //girilen kelime input esit ise tersten e
            System.out.println("Girdiginiz kelime palindrome");
        }else {
            System.out.println("girdiginiz kelime palindrome degil");
        }
    }



}
