package src.practiceAdvance._14_Encapsulation.Q02;


import java.util.Scanner;

public class UserMain {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        User o = new User(); //obje olusturduk

        System.out.print("ad ve soy ad girin :");
        String oName = scan.nextLine();
        System.out.print("ID girin :");
        int oId = scan.nextInt();

        o.setId(oId); //encapsule ettik alinan degerleri
        o.setUserName(oName);

        System.out.println("sifre girin");
        String pass = scan.next();
        o.setPassWord(pass); //encapsule ettik alinan degerleri

        do {
           if (pass.length()<6){
               System.out.println("tekrar girin 6 dan az");
               pass = scan.next();
           }
        } while (pass.length() <= 6);
        o.setPassWord(pass);
        o.setActive(true);
        System.out.println("basarili");
        System.out.println(o); //toString override ile print yaptik

    }
}
