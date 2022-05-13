package src.java_Batch_59_QA.day34_accessModifier_encapsulation;

public class C03 {
    // encapsule edecegimiz 2 variable olusturalim

    private int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }


    public String getStr() { //get ve altaki set biri getirirken digeri set yani chance ediyor
        return str;
    }
//set deger girebiliyor ama okuyamiyor , get okuyabiiyor ama yazamiyor yoneticiler icin
    public void setStr(String str) { //sonucu gostememek icin set yapilir
        this.str = str;
    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                        ", str=" + str ;
    }
}