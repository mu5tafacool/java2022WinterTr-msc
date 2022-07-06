package src.java_Batch_59_QA.day12_stringManipulation;

import java.util.Scanner;

public class C01_Manipulation_Trial {
    public static void main(String[] args) {
        //kullanıcıdan bir cumle ısteyin ve vir
        // harf isteyin ,harfin cumlede olup olmadıgını kontrol edin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle yazınız");

        String cumle=scan.nextLine();
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);

       if (cumle.indexOf(harf)==-1){
           System.out.println("aradıgınız harf cumlede bulunmamaktadır");

        }else{
            System.out.println("aradıgınız harf bulundu");
        }
    }
}


