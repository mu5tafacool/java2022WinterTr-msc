package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";
        //bu cumledeki " "space leri yok edin
        //bosluk disindaki karakter sayisini bulun

        System.out.println("space haric karakter sayisi : " + str.replace(" ","" ).length());
        //" " olanlari "" hiclige ceviriyor
        System.out.println("orjinal hali : " + str.length() + "> " + str);

        // str da kalici degisiklik yapalim
        // bugun yerine yarin
        // ogrendik yerine ogrenecegiz

        //atama yapiyoruz str=str.... seklinde
        str=str.replace("Bugun", "yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra : " + str);


        //atama yapmadan degistirme gosterme yani eski halinde kaliyor
        str.replace("ne cok", "ne az");

        System.out.println(str);
    }
}
