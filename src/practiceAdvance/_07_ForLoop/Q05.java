package src.practiceAdvance._07_ForLoop;

public class Q05 {

    public static void main(String[] args) {
        /* TASK :
Aşağıdaki şekilde çıktı veren programı print içerisinde
sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####

         */
        int satirRakam = 5;
        int sutunRakam = 5;

        for (int i = 1; i <= satirRakam; i++) {
            for (int j = 1; j <= sutunRakam; j++) {

                System.out.print("#");
            }
            System.out.println();
        }

//mscool
        System.out.println("**********HALUK HOCA***********");

        for(int satir=0;satir<5;satir++) // satır kontrolu 1 ile 6 da olurdu
        {
            for(int sutun=0;sutun<5;sutun++)// sutun kontrolu for body tek satır oldg için {} kullanmadık
                System.out.print("#");

            System.out.println();
        }
    }
}
