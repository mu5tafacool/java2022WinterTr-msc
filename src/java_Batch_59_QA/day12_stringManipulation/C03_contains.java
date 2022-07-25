package src.java_Batch_59_QA.day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

       //Scanner scan=new Scanner(System.in);
       //System.out.println("lutfen email adresini girin");
       //String mail= scan.next();

        String email="mulkiyeayboy@gmail.com";

        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){ //! basina ekliyoruz icermiyor isareti
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf(arananMetin)==(email.length()-10)){
            // lastindexte kelimenin son kullaminin indexini vericek
            // aranan metin esit @gmail.com ve sondan baslayarak tamami 10 karakter iceriyor
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontol edin yazdirin");
        }


    }
}
