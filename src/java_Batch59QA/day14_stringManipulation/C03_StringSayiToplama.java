package day14_stringManipulation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {


        //Soru 2) String seklinde verlen asagidaki
        // fiyatlarin toplamini bulunuz
       //String str1 = “$13.99”
       //String str2 = “$10.55”
       //ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="$10.55";

        //nokta ve dolar unlem isaretini kaldirmak
        str1=str1.replaceAll("\\D", ""); //1399 string olarak
        str2=str2.replaceAll("\\D", ""); //1055 string

        //yukarda atadigimiz str1 ve str2 yi double ceviriyoruz
        double str1Sayi=Double.valueOf(str1); //Double.parseDouble(str1) olabilir
        double str2Sayi=Double.valueOf(str2);

        //nokta getirmek icin double kullaniyoruz
        double sonuc=(str1Sayi + str2Sayi)/100;

        //$ isareti koyuyoruz
        System.out.println("verilen string sayilarin toplami : $" + sonuc);

    }
}
