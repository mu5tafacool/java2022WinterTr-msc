package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve
        // kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        String isim="Oguzhan";
        String soyIsim="BALKAYA";
        String kkNo="1234567891234567";

        //birinci aldim buyuk harfe cevirdim sonra 1. harften sonraki hepsini aldim bosluk haric hepsini * cevirdik
        String yeniIsim= isim.substring(0,1).toUpperCase() +
                         isim.substring(1).replaceAll("\\S", "*");
        //2.yontem.......
        // isim.toUpperCase().charAt(0) + (isim.substring(1,isim.length())).replaceAll("\\w","*") >>>>//ismin ilk harfi + ilk harften sonrasini yildiz yaptik


        String yeniSoysim= soyIsim.substring(0,1).toUpperCase() +
                           soyIsim.substring(1).replaceAll("\\S", "*");

        String yenikkNo= "**** **** **** " + kkNo.substring(12);

        System.out.println("isim soyisim : " + yeniIsim + " " + yeniSoysim + "\n" + "Kart No: " + yenikkNo);

    }
}
