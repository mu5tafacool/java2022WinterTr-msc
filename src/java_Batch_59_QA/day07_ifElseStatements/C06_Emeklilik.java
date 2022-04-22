package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("yasini gir");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilir");
        } else {
            System.out.println("emekli olamaz");
            System.out.println(65-yas + " sene daha calismalisin");
        }




    }
}
