package src.java_Batch_59_QA.day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";


        System.out.println(str1 + " " + str2);

        String cumle = str1.concat(str2);

        cumle = str1.concat(" ").concat(str2);

        System.out.println(cumle);


        //cumle=str1.concat(5);
        //cumle=str1.concat(true);

        cumle = str1.concat("" + 5);
        cumle = str1.concat(true + "");

    }
}
