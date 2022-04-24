package src.Proje.P01_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahminFilmListesi {

    static List<String> film = new ArrayList<String>(Arrays.asList("CITYOFGOD", "SPIDERMAN", "THEBATMAN", "THEWOLFOFWALLSTREET", "THESIXTHSENSE", "SLUMDOGMILLIONAIRE",
            "HANNIBAL", "THESILENCEOFLAMBS", "SINCITY", "THEREVENANT", "RUSH", "THETHING", "THELASTSAMURAI", "THEEXORCIST", "THELIVESOFOTHERS", "AMERICANBEAUTY",
            "AMERICANHISTORYX", "AMELIE", "XMEN", "OLDBOY", "THEAMERICANPIE", "ONEFLEWOVERTHECUCKOOSNEST", "TOYSTORY", "THESHINING", "THEDARKKNIGHTRISES", "BATMANBEGINS",
            "THEGREENMILE", "PARASITE", "THESHAWSHANKREDEMPTION", "SCHINDLERSLIST", "THELORDOFTHERINGS", "BEFORESUNRISE", "ROCKY", "INTOTHEWILD", "THERING", "JAWS", "LEON",
            "THEBIGLEBOWSKI", "BEFORESUNSET", "NOTEBOOK", "THETRUMANSHOW", "CATCHMEIFYOUCAN", "FARGO", "MILLIONDOLLARBABY", "VFORVENDETTA", "TRAINSPOTTING",
            "LOCKSTOCKANDTWOSMOKINGBARRELS", "AVENGERS", "SHUTTERISLAND", "JURASSICPARK", "TITANIC", "ABEAUTIFULMIND", "THEUSUALSUSPECTS", "DIEHARD", "SNATCH", "FULLMETALJACKET",
            "SCARFACE", "TAXIDRIVER", "THESTING", "THEDEPARTED", "ACLOCWORKORANGE", "WHIPLASH", "ALIEN", "REQUIEMFORADREAM", "ETERNALSUNSHINEOFTHESPOTLESSMIND", "JOKER", "BRAVEHEART",
            "DJANGOUNCHAINED", "STARWARS", "TERMINATOR", "BACKTOTHEFUTURE", "PSYCHO", "THEPIANIST", "GLADIATOR", "FORRESTGUMP", "THEMATRIX", "GOODFELLAS", "SAVINGPRIVATERYAN",
            "THEDARKKNIGHT", "INCEPTION", "THEPRESTIGE", "DUNKIRK", "MEMENTO", "TENET", "INTERSTELLAR", "FIGHTCLUB", "RESERVOIRDOGS", "KILLBILL", "PULPFICTION", "DEATHPROOF",
            "INGLORIOUSBASTERDS", "THEHATEFULEIGHT", "ONCEUPONATIMEINHOLLYWOOD", "GONEGIRL", "THEGIRLWITHTHEDRAGONTATTOO", "ZODIAC", "PANICROOM", "THEGAME", "SEVEN", "THEGODFATHER"));

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\thosgeldiniz");

        System.out.print("1-" + film.size() + " arasinda film girin : ");
        int secim = scan.nextInt();
        if (secim < 1 && secim > film.size()) {
            System.out.println("dogru rakam girermisin lan");
        }
        fimMethodu(film, secim - 1); //secimin bir eksigi film oluyor
    }

    private static void fimMethodu(List<String> film, int index) {
        StringBuilder tahminEdilenFilm = new StringBuilder(FilmTahminFilmListesi.film.get(index).replaceAll("\\w", "-"));//tum harf karakterleri - ile değiştir
        System.out.println("Tahmin edilen film : " + tahminEdilenFilm + "\n" +
                tahminEdilenFilm.length() + " Harfli film");
        System.out.println("Yanlis/tahmin sayiniz : " + "0" + "/" + (2 * tahminEdilenFilm.length()));

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";

        do {

            System.out.print( "\ntahmin ettiginiz harfi giriniz : ");
            harf = scan.next().toUpperCase().charAt(0);//film için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı
            if (!tahminEdilenFilm.toString().contains(str)) {//tahminEdilecekFilm'de kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
                tahminSayısı++;
            } //else {//tahminEdilecekFilm'de kullanıcıdan alınan harf varsa tekrar uyarısı verildi
            //     System.out.println(str + " harf zaten acıldı");
            // }
            for (int i = 0; i < tahminEdilenFilm.length(); i++) {
                if (film.get(index).charAt(i) == harf) {//tahmin listeki edilen harf filmde varsa
                    if (!tahminEdilenFilm.toString().contains(film.get(index).substring(i, i + 1))) {
                        //tahmin edien harf listteki filmde var ama tahminedilecek (---)filmde yoksa doğru tahmin ettin
                        dogruTahminSayısı++;
                    }
                    tahminEdilenFilm.setCharAt(i, harf);//dogru tahmin edilen harf tahmineilcekfilme indexe göre atandı

                }

            }
            if (tahminEdilenFilm.toString().equalsIgnoreCase(film.get(index))) {
                System.out.println("tebrikler kazndınız");
                System.out.println("tahmin ettiğiniz film : " + tahminEdilenFilm);
                break;
            }
            System.out.println(tahminEdilenFilm);

        } while ((tahminSayısı - dogruTahminSayısı) != 2 * film.get(index).length());//yanlış sayısı verilen hakka ulaşana kadar do body calışır

        if ((tahminSayısı - dogruTahminSayısı) == 2 * film.get(index).length()) {
            System.out.println("yanlıs tahmin sayısı : " + (tahminSayısı - dogruTahminSayısı));
            System.out.println("agam game over yine bekleriz....tahmin edemedigin film : " + film.get(index));
        }
    }
}
