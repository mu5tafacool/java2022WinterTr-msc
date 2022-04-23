package src.trial_Deneme.ArabaEncapsul.Araba;

import java.util.Scanner;

public class ArabaClass extends Araba {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Girilen Scanner a gore araba datalari atama
        //objeye scanner dan yil model atama



        ArabaClass car2 = new ArabaClass();

        System.out.println("model2 gir :");
        String model2 = scan.next();
        car2.setModel(model2);

        System.out.println("sene gir :");
        int sene2 = scan.nextInt();
        car2.setYil(sene2);


        System.out.println("car2 = " + car2);


       /*
       Araba car1 =new ArabaClass();

        System.out.println("model gir :");
        String model1 = scan.next();
        car1.setModel(model1);

        System.out.println("sene gir :");
        int sene1 = scan.nextInt();
        car1.setYil(sene1);

        System.out.println("cc gir :");
        int cc1 = scan.nextInt();
        car1.setCc(cc1);

        System.out.println("car1 = " + car1);
        */
    }
}
