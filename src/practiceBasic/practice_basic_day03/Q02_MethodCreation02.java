package src.practiceBasic.practice_basic_day03;

public class Q02_MethodCreation02 {
    /*
     Problem tanımı :
            Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
            Test Data:
            input: "aabbcccccddddaaa"
            output: abcd

     */
    public static void main(String[] args) {birKereYazdir("aabbcccccddddaaa");
    }

    private static void birKereYazdir(String str) {
        String sonuc = "";
        for (int i = 0; i <= str.length() - 1; i++) {  //0 dan baslayan i length uzunluguna kadar artiyor
            //int i=0;i<str.length();i++  bu sekilde de oluyor
            if (!sonuc.contains(str.substring(i, i + 1))) { //sonuc icermiyor (i dahil i+1 i almadan str ye al)
                sonuc += str.substring(i, i + 1); //sonuca bir ekle str nin i degerini i+1 dahil etmeden
               //harflerin yeri farklida olsa "aasssaarrrss" gibi "asr" yazayiyor yani ilk harfi aliyor gerisini dahil etmiyor
                // "aabbcccccddddaaa"
                // i nin 0 degeri a. a dan sonraki i++ degeri yine a bu if kosulunu saglamiyor
                // ve bir sonraki i degerine geciyor. i nin 3 degeri b bu if kosulunda (!sonuc.contains(str.substring(i,i+1))
                //sagladiginda yani True sonuca i yani b ekliyoruz......
            }
        }
        System.out.println(sonuc);
    }
}