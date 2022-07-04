package src.practiceAdvance._11_dateTime.DataAndKayit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Panel {

    public static void panelComputer() {


        Scanner scan = new Scanner(System.in);


        Regist newPerson = new Regist(); //obj ile method arasinda Call yapmak icin
        List<Person> prsn = new ArrayList<>(); //person class takileri yeni kisi eklemeye list yapiyoruz

        boolean exitIt = true;
        while (exitIt) {

            System.out.print("1: kayit \n2: kisileri goster \n3: kisi Kontrol \n4: exit \nislemi secin :");

            switch (scan.nextInt()) { //scan i buraya atiyoruz
                case 1:
                    prsn = newPerson.registAt(); //public List<Person> registAt() { //kullaniciyi kayit etmek list ekleme methodu
                    break;
                case 2:
                    newPerson.showList(prsn); //kayitli yeni kullaniciyi showlist methodunu prsn objesinine uygulayarak kullan
                    break;
                case 3:
                   newPerson.controlList(prsn);
                    break;
                case 4:
                    System.out.println("hadi eyvallli....");
                    exitIt = false; //while da true olluncaya kadar donuyor. bu onu kirip bitiriyor
                    break;
                default:
                    System.out.println("Hatali");
                    break;
            }
        }

    }
}
