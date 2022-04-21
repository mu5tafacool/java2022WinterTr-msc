package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        String str="    siz ne derseniz diyin Java bildigini okur.     ";

        str.trim();
        System.out.println("atamasiz: "+str);
        System.out.println(str.trim()); //butun bosluklari basta ve sonda siliyor
    }
}
