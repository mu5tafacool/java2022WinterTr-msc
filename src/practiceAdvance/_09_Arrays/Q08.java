package src.practiceAdvance._09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));

        int topDolar=0;
        int topSterlin=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i].contains("$")){
                topDolar+= Integer.parseInt(arr[i].replace("$",""));
            }else{
                topSterlin+= Integer.parseInt(arr[i].replace("£",""));
            }
        }
        System.out.println("toplam dolar tutari :"+topDolar);
        System.out.println("toplam sterlin tutari :"+topSterlin);

        System.out.println("\n\n*******\n2. YOL ForEach\n**************");
        int toplamd = 0;
        int toplame = 0;
//mscool
        //forEach ile
        for (String each : arr) {
            if (each.contains("$")) {
                //each.replase("$","");
                toplamd += Integer.parseInt(each.replace("$", ""));
            } else {
                //each.replase("£","");
                toplame += Integer.parseInt(each.replace("£", ""));
            }
        }
        System.out.println(toplame + " euro  " + toplamd + " dollar");


    }

}

