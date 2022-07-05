package src.java_Batch_59_QA.day12_stringManipulation;

import java.util.Scanner;

public class C01_IndexOf_Trial {
    public static void main(String[] args) {
        //kullanıcıdan bir cumle ve bir kelime isteyin ,
        // kelimenin cumlede kullanımına bakarak
        // asagıdakı 3 cumleden uygun olanı yazdırın

       //girilen kelime cumlede kullanılmamıs
       //gırılen kelime cumlede bir kere kullanılmış
       //gırılen kelıme cumlede 1den fazla kullanılmıs

       Scanner scan=new Scanner(System.in);
       System.out.println("lütfen bir cümle yazınız");
       String cumle=scan.nextLine();

       System.out.println("lutfen bir kelime giriniz");
       String kelime= scan.next();

       int ilkIndex=cumle.indexOf(kelime);
       int ikinciIndex=cumle.indexOf(kelime,ilkIndex+1);
       System.out.println(ilkIndex);
       System.out.println(ikinciIndex);
       if (cumle.indexOf(kelime)==-1){
           System.out.println("Girilen kelime cumlede kullanılmamıs");
       }else if (ikinciIndex>ilkIndex){
           System.out.println("Girilen kelime cumlede 1den fazla kullanılmış");
       }else {
           System.out.println("Girilen kelıme cumlede 1 ker kullanılmıs");

       }

    }
}


