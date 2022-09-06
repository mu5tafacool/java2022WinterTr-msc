package src.practiceAdvance._06_Method_Creation;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */


        System.out.println("*********** String ile cozum **************");
        String kelime = "The quick brown fox jumps over the lazy dog";

        String kacKelime = kelime.replaceAll("\\S", "");
        System.out.println("kac kelime = " + kacKelime); //bosluk sayisindan bir fazladir
        System.out.println(kacKelime.length() + 1);


        System.out.println("********* Method COZUM ******************");
        int sonuc = cumle("javacı arkadaşlar zehir gibi maaşallah en kısa zamanda çok bin $'lı iş bulurlar");

        System.out.println("Girilen String'te kelime sayısı : " + sonuc);

    }

    public static int cumle(String str) { //1 sayac koyuyoruz>  int count = 0;
                      //2 boslugu saymak icin atama yapiyoruz>  char space = ' '
        //bosluklara sayacak bir for dondusu yapiyoruz ve
        // her boslugu sayaca ekliyip sonucada bir ekliyoruz
        int count = 0;

        char space = ' ';//bu satırı tanımlamak yerine if şartını ==' ' şeklinde de tanımlayabilirdik.

        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == space) {
                count++;

            }
        }

        return count + 1;//niye count+1 çünki for içinde a<str.length e kadar ama eşit değil 1 eksik verir


//
//        	   String[] words=str.split(" ");
//
//
//
//        	   return words.length;




    }
}
