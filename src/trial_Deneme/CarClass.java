package src.trial_Deneme;


import java.util.Scanner;

public class CarClass {

    ///Araba model ve yili yazdiran method

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("model girin");
        String model = scan.next();
        System.out.println("yili girin");
        String yil = scan.next();

        CreateCar(yil, model);

    }

    private static void CreateCar(String yil, String model) {
        CarMain Volvo = new CarMain(yil, model);
        System.out.println("Volvo = " + Volvo);
    }

}
