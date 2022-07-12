package src.java_Batch_59_QA.day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        //girilen kelime cumlede kullanılmamıs
        //gırılen kelime cumlede bir kere kullanılmış
        //gırılen kelıme cumlede 1den fazla kullanılmıs
        String cumler="Java ogren, yeni probram ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkkullanim= cumler.indexOf(kelime); //-1 cikar veya index
        int sonkullanim= cumler.lastIndexOf(kelime);
        //lastIndexof sondan basliyor

        if (ilkkullanim==(-1)){
            System.out.println("girilen kelime cumlede kullanılmamıs");
        } else if (ilkkullanim==sonkullanim){
            System.out.println("gırılen kelime cumlede bir kere kullanılmış");
        } else {
            System.out.println("gırılen kelıme cumlede 1den fazla kullanılmıs");
        }


        String str="Eclipse";
        System.out.println(str.lastIndexOf("p", 4));
        //4 dahil "E0 c=1 l=2 i=3 p=4 s e"



    }
}
