package day13_stringManipulation;

public class C02_subsring {
    public static void main(String[] args) {



        String str="1-48 of 104 result for \"nutella\"";

        //bosluktan yapariz 104 basinda sonundaki bosluklardan
        int ilkSpace=str.indexOf(" "); //4 vericek ilk bosluk
        int ikinciSpace=str.indexOf(" ",ilkSpace+1); //boksluk ariyacaz ilk spaceden sonra
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1); //ikinci boksluk ariyacaz ilk spaceden sonra

        String aramaSonucSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);
        System.out.println(aramaSonucSayisiStr);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt>100){
            System.out.println("Super");
        } else {
            System.out.println("100 altinda");
        }

       //2.cozum................
        System.out.println("\n2. cozum........");

        int a=str.indexOf("of");
        String son=str.substring(a+3,a+6);
        System.out.println(son);
        int b=Integer.valueOf(son);

        if (b>=100) System.out.println("super");
        else System.out.println("az sonuc bulundu");


        //3.............
        System.out.println("\n3. cozum........");

        int sonIndex = str.indexOf(" result");
        int ilkIndex = str.lastIndexOf("of ");
        System.out.println(str.substring(ilkIndex+3,sonIndex)); //ilk indeksten 3 karakter ile basla son index e kadar

        int sonuc=Integer.valueOf(str.substring(ilkIndex+3,sonIndex));

        if (sonuc>=100) System.out.println("super");
        else System.out.println("az sonuc bulundu");


        //4..........

        System.out.println("\n4. cozum... " + "\n" +
                str.substring((str.indexOf('f') + 2), str.indexOf('r')));
    }
}
