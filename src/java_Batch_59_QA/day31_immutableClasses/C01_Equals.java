package src.java_Batch_59_QA.day31_immutableClasses;

public class C01_Equals {

    public static void main(String[] args) {

        String str1= "Eren";
        String str2= "Eren"; //eger yeni bir obje olusturma veya bir islem yapma yoksa
        //Java string havuzunu kontrol eder. yani str1 ve str2 objeleri ayni olur bu durumda

        String str3= new String("Eren");
        //variable = degerdir  bu durumda yeni obje olusturu

        String str4= str1+"";
        //st4 = str1 ama +"" concatinations oldugundan yeni bir obje olusturur


        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true


        // == hem degere hemde referansa bakar
        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false objeler farkli
        System.out.println(str1==str4); // false objeler farkli



    }
}