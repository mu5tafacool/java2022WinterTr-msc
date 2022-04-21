package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        //girilen kelime cumlede kullanılmamıs
        //gırılen kelime cumlede bir kere kullanılmış
        //gırılen kelıme cumlede 1den fazla kullanılmıs
        String cumler="Java ogren, yeni probram ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkkullanim= cumler.indexOf(kelime); //-1 cikar veya index
        int ikincikullanim= cumler.indexOf(kelime,ilkkullanim+1);
        //+1 deme eger ilkkullanimda olmasa bile java -1 veriyordu +1 toplanarak 0 inci inceksten baslar
       //ilkkullanim +1 ikinci yeni bulmak icin

        if (ilkkullanim==(-1)){
            System.out.println("girilen kelime cumlede kullanılmamıs");
        } else if (ikincikullanim==(-1)){
            System.out.println("gırılen kelime cumlede bir kere kullanılmış");
        } else {
            System.out.println("gırılen kelıme cumlede 1 den fazla kullanılmıs");
        }

    }
}
