package src.practiceAdvance._13_StringBuilder;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
        // StringBuilder abj1 = new StringBuilder("I love Java");
        StringBuilder abj1 = new StringBuilder("ey edip pide ye");

       /*
        System.out.println("abj1.toString() = " + abj1.toString());
        System.out.println("abj1.reverse().toString() = " + abj1.reverse().toString());
        to string e cevirerek equalsIgnore calistiriyoruz.
        ters cevirmede ise once abj1 ceviriyoruz sonra toString yapiyoruz
        */

        if (abj1.toString().equalsIgnoreCase(abj1.reverse().toString())) {
            System.out.println("palidrome " + abj1 + " = " + abj1.reverse());

        }
        System.out.println("degildir");


    }

}
