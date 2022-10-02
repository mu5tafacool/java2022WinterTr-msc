package src.Proje.P02_javaBankATM.JavaBankMsc;


import static src.Proje.P02_javaBankATM.JavaBankMsc.BankRunner.scan;

public class BankClass<index> extends JavaProjects.P02_javaBankATM.JavaBankMsc.BankControl {

    //        Bakiye sorgula, para yatirma, para çekme, para gönderme, 
    //        sifre değiştirme ve cikis.

    public static int bakiye = 1500;
    public static int yatirma;
    public static int cekme;
    public static int gonderme;
    static String passW = "asd123";
    public static int secim;






//kart sifreden sonra islemler olmali




    public static void setPassW(String passW) {
        BankClass.passW = passW;
    }












        public static int getSecim () {
            return secim;
        }


        public static void setSecim ( int secim){

            BankClass.secim = secim;
            switch (secim) {
                case 1:
                    System.out.println("secim = " + secim);
                    bakiyeOgrenme();
                    break;
                case 2:
                    paraYatır();
                    break;
                case 3:
                    paraCek();
                    break;
                case 4:
                    paraGonder();
                    break;
                case 5:
                    sıfreDegis();
                    break;
                case 0:
                    try {
                        eXit();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("hatalı secım. Tekrar deneyınız.");
                    setSecim(secim);
            }
        }
        // BankClass.secim = secim;


    private static void bakiyeOgrenme() {

        System.out.println("mevcut bakıyenız : " + bakiye + " TL.");
        System.out.println("devam etmek için herhangi bir tusa basınız");
        scan.next();
        // setSecim(secim);

    }

    private static void eXit() throws InterruptedException {
        System.out.println("*");
        Thread.sleep(1000);
        System.out.println("**");
        Thread.sleep(1000);
        System.out.println("***");
        Thread.sleep(1000);
        System.out.println("****");
        Thread.sleep(1000);
        System.out.println("*****");
        Thread.sleep(1000);
        System.out.println("hatalı secım. Tekrar deneyınız.");

    }


    private static void sıfreDegis() {
        System.out.print("mevcut sıfrenızı gırınız : ");
        System.out.println();
        String sifreKontrol = scan.next();
        if (sifreKontrol == passW) {
            System.out.print("yeni sifrenizi giriniz : ");
            String yeniSifre = scan.next();
            System.out.println("yeni sifrenizi " + yeniSifre + " olarak onaylıyor musunuz?  (E/H)");
            String onaylansınMı = scan.next();
            if (onaylansınMı.equalsIgnoreCase("e")) {
                passW = yeniSifre;
                System.out.println("işlem basarı ıle yapıldı. Yenı sıfrenız : " + passW);
                System.out.println("devam etmek için herhangi bir yusa basınız");
                scan.next();
                setSecim(secim);
            }

        } else {
            System.out.println("sıfrenız uyusmadı tekrar deneyınız");
            System.out.println("devam etmek için herhangi bir yusa basınız");
            scan.next();
            setSecim(secim);
        }
    }

    private static void paraGonder() {
        System.out.print("gondermek ıstedıgınız mıktrı gırınız : ");
        double gonderılecekMıktar = scan.nextDouble();
        System.out.println();
        if (gonderılecekMıktar < bakiye) {
            System.out.println("iban numarsaını gırınız : ");
            String ıbanNo = scan.next();

            if (ıbanNo.startsWith("TR")) {
                if (ıbanNo.length() == 26) {
                    bakiye -= gonderılecekMıktar;
                    System.out.println("para gonderme işlemi basarı ıle gerceklesti.\nGonderilen miktar : " + gonderılecekMıktar + "\nKalan bakıyenız : " + bakiye);
                    System.out.println("devam etmek için herhangi bir tusa basınız");
                    scan.next();
                    setSecim(secim);
                } else {
                    System.out.println("iban numarası 26 hanelı olmalı.");
                    System.out.println("devam etmek için herhangi bir yusa basınız");
                    scan.next();
                    setSecim(secim);
                }
            } else {
                System.out.println("iban TR ile baslamalı!");
                System.out.println("devam etmek için herhangi bir yusa basınız");
                scan.next();
                setSecim(secim);
            }
        }
    }

    private static void paraCek() {
        System.out.print("çekmek ıstedıgınız mıktarı gırınız : ");
        double cekilenMiktar = scan.nextDouble();

        if (cekilenMiktar < bakiye) {
            bakiye -= cekilenMiktar;
            System.out.println("işleminiz yapıldı. \nKalan bakiyeniz : " + bakiye);
            System.out.println("devam etmek için herhangi bir yusa basınız");
            scan.next();
            setSecim(secim);
        } else {
            System.out.println("bakıyenız yetersız!\ndevam etmek için herhangi bir tusa basın.");
            scan.next();
            setSecim(secim);

        }


    }


    private static void paraYatır() {
        System.out.print("yatıracagınız miktari giriniz : ");
        double yatanPara = scan.nextDouble();
        bakiye += yatanPara;
        System.out.println("işleminiz yapıldı. Yeni bakıyenız : " + bakiye);
        System.out.println("devam etmek için herhangi bir yusa basınız");
        scan.next();
        setSecim(secim);
    }






}