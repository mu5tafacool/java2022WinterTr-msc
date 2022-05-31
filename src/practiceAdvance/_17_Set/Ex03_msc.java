package src.practiceAdvance._17_Set;

import java.util.ArrayList;

public class Ex03_msc {
/* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list = arrayOlusturma(30, 0, 10); //verilen size ramdom degerlerie gore method olusturduk
        System.out.println("list = " + list); // Randomdan sonra olusturulan Array


        tekrarisilme(list);


        konteynerOlmadanSilme(list);
        System.out.println("konteynerOlmadanSilme = " + list);


    }

    private static void konteynerOlmadanSilme(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) { //konteynira ihtiyac olmadan tekrar yapma
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;                //aynı eleman varsa bir indexteki elemanı silecek, eleman atlamaması için "j--"
                }

            }

        }

    }

    private static void tekrarisilme(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>(); //konteyner olusturuyoruz
        for (int i = 0; i < list.size(); i++) {  //listten gelen unique de uniqueListte her indexi atayarak konrol
            if (!uniqueList.contains(list.get(i))) {
                uniqueList.add(list.get(i)); //uniqueList konteynerinda yoksa ekle
            }
        }
        System.out.println("uniqueList = " + uniqueList);
    }

    private static ArrayList<Integer> arrayOlusturma(int size, int min, int max) {
        ArrayList<Integer> listBos = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            listBos.add(getRandom(min, max));
        }
        System.out.println("listBos = " + listBos);

        return listBos;
    }

    private static Integer getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1));
    }

}

