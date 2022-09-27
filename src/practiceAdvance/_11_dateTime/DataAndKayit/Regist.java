package src.practiceAdvance._11_dateTime.DataAndKayit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Regist {

    //person classinda yani <const olan Person> Individuals adinda objede ozellikleri yil name data
    List<Person> Individuals = new ArrayList<>(); //bos list olusturuyoruz bu bireyleri buraya atmak icin
    List<Person> idData = new ArrayList<>(); //bos id listi
    /*****bak random id sil  calisiyor*/
    static Random rnd = new Random(); //id numasi atiyoruz rasgele
    public List<Person> registAt() { //kullaniciyi kayit etmek list ekleme methodu
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi - ");
        System.out.print("Dogum Yili :");
/*****bak siraylami calisiyor*/ // Person p1 = new Person(scan.next(), scan.nextInt(), LocalDateTime.now());
        String a = String.valueOf((rnd.nextInt(100))); // ID ekliyor Random integer olan sayiyi String e cevirme
        Person p1 = new Person(a, scan.next(), scan.nextInt(), LocalDateTime.now());

        Individuals.add(p1);

        System.out.println("kayit Yapilmistir....");

        return Individuals; //devamli kayit almak icin yapiliyor
    }


    public void showList(List<Person> p) { //person classina listelenen p kisileri gosterme
        System.out.println("============================================");
        System.out.println("ID  AD        Dogum T.     Kayit T.");

        for (Person each : p) { //person int string gibi paket classtan her (each) p kisileri getir
            //  System.out.println("Adi : " + each.name + "\nDogum Yili" + each.bornYear + "\nKayit Zamani : " + each.registTime);

            System.out.printf("%-3s %-8s   %-6d   %s\n", each.iD, each.name, each.bornYear, each.registTime);
            //souf ile yazdirma
        }

    }

    public void controlList(List<Person> control) {
        /******************************************iki defa scan istiyor  */
        Scanner scan = new Scanner(System.in);
        System.out.print("Aranacak ID : ");
        String idCheck = scan.next();
        for (Person each : control) {
            if (each.iD.equals(idCheck)) {
                System.out.printf("%-3s %-8s   %-6d   %s\n", each.iD, each.name, each.bornYear, each.registTime);

            } else {
                System.out.println(scan.nextInt() + " Id bulunamadi");
            }
        }

    }
}
