package src.practiceAdvance._06_Method_Creation;

import java.util.Scanner;

public class Q11 {
    static int bakiye = 1000; //basta statik bakiyeyi tanimlammamiz her methodta gozuksun diye
    //tipki Ay gibi
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4 ");
        secim();
    }

    private static void secim() {
        System.out.print("yapacagınız işlemi seciniz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakıyeSorgulama();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatir();
                break;
            case 4:
                cıkıs();
                break;
        }
    }

    private static void paraYatir() {
        System.out.print("agamın eli tutulmazzzz  :-) : ");
        int yatırılacakMiktar = scan.nextInt();
        bakiye += yatırılacakMiktar;
        System.out.println("agam paran hesaba  aynen     ");
        System.out.println("   ***   ");
        System.out.println("işleme devam etmek istiyorsanız  1\n işleme devam etmek istemiyorsanız  0\n tuslayınız ");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim(); //20. satirdaki secime tekrar yonlendirecek ki tekrar secim yapalim diye
        } else cıkıs();

    }

    private static void paraCek() {
        System.out.print("cekeceginiz var benden:-) ne kadar istiyon : ");
        int cekilecekMiktar = scan.nextInt();
        if (cekilecekMiktar > bakiye) {
            System.out.println("bakıyen yoooh agam olsa dükkan senin :-( ");
        } else {
            bakiye -= cekilecekMiktar;
            System.out.println("cektini paranın hayrını gör  ....");
        }
        System.out.println("   ***   ");
        System.out.println("işleme devam etmek istiyorsanız  1\n işleme devam etmek istemiyorsanız  0\n tuslayınız ");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cıkıs();

    }

    private static void bakıyeSorgulama() {
        System.out.println("bakıyeniz :" + bakiye);
        System.out.println("   ***   ");
        System.out.println("işleme devam etmek istiyorsanız  1\n işleme devam etmek istemiyorsanız  0\n tuslayınız ");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cıkıs();
    }

    private static void cıkıs() {

        System.out.println("cıkısınız yapıldı yine bekleriz selametle :)");
    }
}
