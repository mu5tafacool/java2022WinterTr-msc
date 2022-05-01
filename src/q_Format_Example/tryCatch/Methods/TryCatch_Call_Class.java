package src.q_Format_Example.tryCatch.Methods;


public class TryCatch_Call_Class {

    public static void main(String[] args) {


/** Int alinan rakama harf girildiginde exception olmamasi icin*/

        System.out.print("Rakam girin :");
        int secim = TryCatch_Integer_Method.intGirisi(); //bu klastaki int olani calistirip kontrol ediyoruz


        System.out.println("secim = " + secim);
    }



 /*
  public static void islemlerMenu (){.......eger method ise

            System.out.print("Rakam girin :");
    int secim = TryCatch_Integer_Method.intGirisi();
}
*/
}
