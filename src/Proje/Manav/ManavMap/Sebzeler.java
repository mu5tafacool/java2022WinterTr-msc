package src.Proje.Manav.ManavMap;

import java.util.ArrayList;
import java.util.Arrays;

public class Sebzeler {

    private double domatesFiyat = 5.0;
    private double ElmaFiyat = 7.5;
    private double MuzFiyat = 1.3;
    private double BiberFiyat = 8.7;
    private double PatlicanFiyat = 9.2;

    private double yeniUrunFiyati;
    private String yeniUrunAdi;


    static ArrayList<String> urunlerList = new ArrayList<>(Arrays.asList(
            "Domat  - urun kodu : 1", "Elma   - urun kodu : 2", "Muz    - urun kodu : 3",
            "Biber  - urun kodu : 4", "Patlcan - urun kodu : 5", "Urun eklemek icin : 10", "Cikmak icin : 0"));


    public Sebzeler(double domatesFiyat, double elmaFiyat, double muzFiyat, double biberFiyat, double patlicanFiyat) {
        this.domatesFiyat = domatesFiyat;
        ElmaFiyat = elmaFiyat;
        MuzFiyat = muzFiyat;
        BiberFiyat = biberFiyat;
        PatlicanFiyat = patlicanFiyat;
    }

    public Sebzeler() {

    }


    public Sebzeler(double domatesFiyat) {
    }

    public Sebzeler(String yeniUrunAdi, Double yeniUrunFiyati) {
        this.yeniUrunAdi = yeniUrunAdi;
        this.yeniUrunFiyati = yeniUrunFiyati;

    }

    public double getYeniUrunFiyati() {
        return yeniUrunFiyati;
    }

    public void setYeniUrunFiyati(double yeniUrunFiyati) {
        this.yeniUrunFiyati = yeniUrunFiyati;
    }

    public String getYeniUrunAdi() {
        return yeniUrunAdi;
    }

    public void setYeniUrunAdi(String yeniUrunAdi) {
        this.yeniUrunAdi = yeniUrunAdi;
    }

    public double getDomatesFiyat() {
        return domatesFiyat;
    }

    public void setDomatesFiyat(double domatesFiyat) {
        this.domatesFiyat = domatesFiyat;
    }

    public double getElmaFiyat() {
        return ElmaFiyat;
    }

    public void setElmaFiyat(double elmaFiyat) {
        ElmaFiyat = elmaFiyat;
    }

    public double getMuzFiyat() {
        return MuzFiyat;
    }

    public void setMuzFiyat(double muzFiyat) {
        MuzFiyat = muzFiyat;
    }

    public double getBiberFiyat() {
        return BiberFiyat;
    }

    public void setBiberFiyat(double biberFiyat) {
        BiberFiyat = biberFiyat;
    }

    public double getPatlicanFiyat() {
        return PatlicanFiyat;
    }

    public void setPatlicanFiyat(double patlicanFiyat) {
        PatlicanFiyat = patlicanFiyat;
    }

    public static ArrayList<String> getUrunlerList() {
        return urunlerList;
    }

    public static void setUrunlerList(ArrayList<String> urunlerList) {
        Sebzeler.urunlerList = urunlerList;
    }

    @Override
    public String toString() {
        return "Sebzeler{" +
                "domatesFiyat=" + domatesFiyat + " TL " +
                ", ElmaFiyat=" + ElmaFiyat + " TL " +
                ", MuzFiyat=" + MuzFiyat + " TL " +
                ", BiberFiyat=" + BiberFiyat + " TL " +
                ", PatlicanFiyat=" + PatlicanFiyat + " TL " +
                '}';
    }
}
