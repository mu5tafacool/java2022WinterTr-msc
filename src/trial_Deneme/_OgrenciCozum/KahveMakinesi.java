package src.trial_Deneme._OgrenciCozum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveMakinesi {
    static int secim;

   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) throws InterruptedException {
       System.out.println("***Hoşgeldiniz***");

       String hangiKahve = kahveSecimi();
       String hangiBoyut = boyutSecimi();
       sutSecimi();
       sekerSecimi();

       Thread.sleep(1000);
       System.out.println("\n" + hangiKahve + " " + hangiBoyut + " hazırdır\n       Afiyet olsun");


   }

   private static void sekerSecimi() throws InterruptedException {
       Thread.sleep(1000);
       System.out.print("\nŞeker eklenmesini ister misiniz?\nEvet - 1\nHayır - 2\n\nİptal için - 0\nSeçiminiz: ");
       secim = scan.nextInt();

       switch (secim) {
           case 0:
               System.out.println("\nİşleminiz iptal edildi...yine bekleriz");
               System.exit(0);
           case 1:
               System.out.print("Kaç şeker istersiniz? 1-2-3\nSeçiminiz: ");
               secim = scan.nextInt();
               switch (secim) {
                   case 1:
                   case 2:
                   case 3:
                       System.out.print(secim + " şeker ekleniyor");
                       Thread.sleep(400);
                       System.out.print(".");
                       Thread.sleep(400);
                       System.out.print(".");
                       Thread.sleep(400);
                       System.out.println(".");
                       Thread.sleep(1000);
                       break;
                   default:
                       System.out.println("\nYanlış seçim yaptınız... \nŞeker seçimi menüsüne yönlendiriliyorsunuz...");
                       Thread.sleep(1000);
                       sekerSecimi();

               }
               break;
           case 2:
               System.out.println("Şeker eklenmiyor...");
               break;
           default:
               System.out.println("\nYanlış seçim yaptınız...lütfen tekrar deneyiniz.");
               sekerSecimi();
       }
   }

   private static void sutSecimi() throws InterruptedException {
       Thread.sleep(1000);
       System.out.print("\nSüt eklenmesini ister misiniz?\nEvet - 1\nHayır - 2\n\nİptal için - 0\nSeçiminiz: ");
       secim = scan.nextInt();

       switch (secim) {
           case 0:
               System.out.println("\nİşleminiz iptal edildi...yine bekleriz");
               System.exit(0);
           case 1:
               System.out.print("Süt ekleniyor");
               Thread.sleep(400);
               System.out.print(".");
               Thread.sleep(400);
               System.out.print(".");
               Thread.sleep(400);
               System.out.println(".");
               Thread.sleep(1000);
               break;
           case 2:
               System.out.println("Süt eklenmiyor...");
               break;
           default:
               System.out.println("\nYanlış seçim yaptınız...lütfen tekrar deneyiniz.");
               sutSecimi();
       }

   }

   private static String boyutSecimi() throws InterruptedException {
       List<String> boyutlar = new ArrayList<>();
       boyutlar.add("");
       boyutlar.add("Büyük boy");
       boyutlar.add("Orta boy");
       boyutlar.add("Küçük boy");

       Thread.sleep(1000);
       System.out.print("\nHangi boyutta olsun?\nBüyük boy - 1\nOrta boy - 2\nKüçük boy - 3\n\nİptal için - 0\nSeçiminiz: ");
       secim = scan.nextInt();

       switch (secim) {
           case 0:
               System.out.println("\nİşleminiz iptal edildi...yine bekleriz");
               System.exit(0);
           case 1:
           case 2:
           case 3:
               System.out.print(boyutlar.get(secim) + " hazırlanıyor");
               Thread.sleep(400);
               System.out.print(".");
               Thread.sleep(400);
               System.out.print(".");
               Thread.sleep(400);
               System.out.println(".");
               Thread.sleep(1000);
               break;
           default:
               System.out.println("\nYanlış seçim yaptınız...lütfen tekrar deneyiniz.");
               boyutSecimi();
       }
       return boyutlar.get(secim);

   }

   private static String kahveSecimi() throws InterruptedException {
       List<String> kahveler = new ArrayList<>();
       kahveler.add("");
       kahveler.add("Türk kahvesi");
       kahveler.add("Filtre kahve");
       kahveler.add("Espresso");


       System.out.print("\nHangi kahveyi istersiniz?\nTürk kahvesi - 1\nFiltre kahve - 2\nEspresso - 3\n\nİptal için - 0\nSeçiminiz: ");
       secim = scan.nextInt();

       switch (secim) {
           case 0:
               System.out.println("\nİşleminiz iptal edildi...yine bekleriz");
               System.exit(0);
           case 1:
           case 2:
           case 3:
               System.out.print(kahveler.get(secim) + " hazırlanıyor");
               Thread.sleep(400);
               System.out.print(".");
               Thread.sleep(400);
               System.out.print(".");
               Thread.sleep(400);
               System.out.println(".");
               Thread.sleep(1000);
               break;
           default:
               System.out.println("\nYanlış seçim yaptınız...lütfen tekrar deneyiniz.");
               kahveSecimi();

       }
       return kahveler.get(secim);

    }
}
