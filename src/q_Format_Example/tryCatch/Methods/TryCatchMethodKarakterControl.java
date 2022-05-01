package src.q_Format_Example.tryCatch.Methods;

import java.util.Scanner;

public class TryCatchMethodKarakterControl {
    public static void main(String[] args) {

        tryCatchMethodKarakterControl();
    }

    public static void tryCatchMethodKarakterControl() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("yas girin : ");
            String str = scan.nextLine();
            //scan.nextLine();//dummy
            if (str.equalsIgnoreCase(".")
                    || str.equalsIgnoreCase(" ")
                    || str.equalsIgnoreCase("?")
                    || str.equalsIgnoreCase(",")
                    || str.equalsIgnoreCase("!")
                    || str.equalsIgnoreCase("`")
                    || str.equalsIgnoreCase("@")
                    || str.equalsIgnoreCase("#")
                    || str.equalsIgnoreCase("$")
                    || str.equalsIgnoreCase("%")
                    || str.equalsIgnoreCase("^")
                    || str.equalsIgnoreCase("&")
                    || str.equalsIgnoreCase("*")
                    || str.equalsIgnoreCase("(")
                    || str.equalsIgnoreCase(")")
                    || str.equalsIgnoreCase("+")
                    || str.equalsIgnoreCase("-")
                    || str.equalsIgnoreCase("=")
                    || str.equalsIgnoreCase("]")
                    || str.equalsIgnoreCase("[")
                    || str.equalsIgnoreCase("{")
                    || str.equalsIgnoreCase("}")
                    || str.equalsIgnoreCase("'")
                    || str.equalsIgnoreCase("\"")
                    || str.equalsIgnoreCase("\\")
                    || str.equalsIgnoreCase(";")
                    || str.equalsIgnoreCase(":")
                    || str.equalsIgnoreCase("<")
                    || str.equalsIgnoreCase(">")
                    || str.equalsIgnoreCase("|")
                    || str.equalsIgnoreCase("/")) {
                // throw new ArithmeticException("Bu karakter olmaz " + str);
                System.out.println(str + " karakter olmaz ");
                tryCatchMethodKarakterControl(); //retun icin method yapildi
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
