package src.practiceAdvance._04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi_me {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("******seyahat sirketinize hos geldiniz *******");
        System.out.println("Frankfurt : 60 km \nKoln : 88\n20 km basina 5 euro ucretledi");
        System.out.print("yolculuk yapacaginiz sehri secin: ");
        String hedef = scan.next().toUpperCase();
        System.out.print("kisi sayisini girin : ");

        int kisi = scan.nextInt();
        double bakiye = 100;
        double fUcret = (60 / 20) * 5;
        double klUcret = (80 / 20) * 5;

        switch (kisi){
            default:
                System.out.println("hatali kisi girisi");
                break;
            case 1:
                if (hedef.equalsIgnoreCase("FRANKFURT")){
                    System.out.println("Frankfurt " + fUcret + "Euro");
                    System.out.println("bilet turar : " + (fUcret * 1) + "Euro");
                }else if (hedef.equalsIgnoreCase("KOLN")){
                    System.out.println("1 kişilik bilet talep ettiniz " + "bilet tutarınız : "
                            + klUcret + " EURO" + " güncel bakıyeniz: " + (bakiye -= klUcret) + " EURO");

                }else System.out.println("hatali sehir girisi");
                break;
            case 2:
                if (hedef.equalsIgnoreCase("FRANKFURT")){
                    System.out.println("bilet turar : " + (fUcret * 1) + "Euro");

                }else if (hedef.equalsIgnoreCase("KOLN")){
                    System.out.println("2 kişilik bilet talep ettiniz " +
                            "bilet tutarınız : " + (klUcret * 2) + " EURO " + "güncel bakıyeniz: " + (bakiye -= klUcret * 2) + " EURO");

                } else System.out.println("hatali sehir girisi");
                break;
        }

    }
}
