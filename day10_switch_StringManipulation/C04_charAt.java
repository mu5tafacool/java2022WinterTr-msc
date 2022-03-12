package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        String str="java Cok guzel";

        //j yazdirmak icin 0 dan basladigindan
        System.out.println(str.charAt(0));

        //g yi yazdirmak icin =java Cok guzel 9. karakter
        System.out.println(str.charAt(9));

        //va yazdirmak "" ekliyoruz cunku harfleri toplamada rakama cevirir
        System.out.println("" + str.charAt(2)+str.charAt(3));

        //cOK seklinde yazdirma
        System.out.println(str.toLowerCase().charAt(5) +
                "" + str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));

        //son harfi yazdir
        System.out.println(str.charAt(14-1)); //uzunluk -1



    }
}
