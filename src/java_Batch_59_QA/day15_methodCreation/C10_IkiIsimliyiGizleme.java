package src.java_Batch_59_QA.day15_methodCreation;

import java.util.Scanner;

public class C10_IkiIsimliyiGizleme {
    public static void main(String[] args) {
        //iki adi olan kisinin adini gizleme

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ad girin");
        String isim = scan.nextLine();
        System.out.println("Lutfen ikinci adi girin");
        String ikinciisim = scan.nextLine();

        System.out.println("Lutfen bir soyad girin");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen bir kart no girin");
        String kKNo = scan.nextLine();

        //String isim = "yasemin yalcin";
        //String soyisim= "sari";
        //String kKNo="1234567890128795";

        // eger bir method'dan bir islem yapmasini
        // ve yaptigi islemi bize getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data turunde olmalidir

        String gizlenmisIsimSoyisim = isimSoyisimGizle(isim,ikinciisim, soyisim);
        // bana isim ve soyismin gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur cunku bunu yazdiracagim

        System.out.println(gizlenmisIsimSoyisim); //gizlenmis olani asayida ccalisan method ile yaziyoruz
        String gizlenmisKKNo = krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);
    }

    public static String isimSoyisimGizle(String isim,String ikinciisim, String soyisim) {
        if (ikinciisim.isEmpty()) {

            String yeniIsim = isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).replaceAll("\\S", "*"); //ismin ilk harfi al upper yap
            // 2. harften sonra tum karakterleri yildiza replace yap

            String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                    soyisim.substring(1).replaceAll("\\S", "*");
            return yeniIsim + " " + yeniSoyisim;
        } else {
            String yeniIsim = (isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\S", "*")) +
                  " "+  ikinciisim.substring(0, 1).toUpperCase() + ikinciisim.substring(1).replaceAll("\\S", "*");

            String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                    soyisim.substring(1).replaceAll("\\S", "*");
            return yeniIsim + " " + yeniSoyisim;
        }
    }
        private static String krediKartiGizle (String kKNo){
            String yeniKKNo = "**** **** **** " + kKNo.substring(12);
            return yeniKKNo;
        }

}