package day18_nestedForLoop;

public class C01_ForLoop2 {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        int input =9;
        int faktoryel=1;
        String faktoryelAcikYazim="";

        for (int i =input; i>=1 ; i--) {

            faktoryel *=i; //i ile carpik faktoryel atiyor
            // sonra i yi bir dusurup tekrar faktoryel ile carpiyor

            //System.out.println(input + "! = " + faktoriyelAcıkYazim.substring(0, faktoriyelAcıkYazim.length()-1) + " = " +faktoryel);

            if (i==input){
                faktoryelAcikYazim=faktoryelAcikYazim+ i;
            }else
                faktoryelAcikYazim=faktoryelAcikYazim+ "*"+ i;
        }
        System.out.println(input+"! ="+ faktoryelAcikYazim + "=" + faktoryel);
    }
}
