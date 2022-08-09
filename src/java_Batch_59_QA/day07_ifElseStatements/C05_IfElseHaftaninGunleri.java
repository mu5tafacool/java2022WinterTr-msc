package src.java_Batch_59_QA.day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("gun yaz");
        String gunIsmi = scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESİ")) {
            System.out.println("haftasonu");
        } else {
            System.out.println("haftaici");

        }


    }
}
