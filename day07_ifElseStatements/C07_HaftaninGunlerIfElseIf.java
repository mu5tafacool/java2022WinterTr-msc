package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunlerIfElseIf {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("gunu girin");
        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("gun hafta sonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba")||gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")){
            System.out.println("gun hafta ici");

        } else {
            System.out.println("lutfen gecerli bir gun girin");
        }
    }
}
