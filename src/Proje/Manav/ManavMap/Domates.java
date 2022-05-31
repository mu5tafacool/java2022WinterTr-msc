package src.Proje.Manav.ManavMap;

public class Domates extends Sebzeler {

    double alinanKg;
    double urunToplam;

    @Override
    public double getDomatesFiyat() {
        return super.getDomatesFiyat();
    }



    public void hesaplama() {
        urunToplam += alinanKg * super.getDomatesFiyat();

    }

    public Domates(double domatesFiyat, double elmaFiyat, double muzFiyat, double biberFiyat, double patlicanFiyat) {
        super(domatesFiyat, elmaFiyat, muzFiyat, biberFiyat, patlicanFiyat);
    }

    //ayri const olusturduk sadece fiyat alinan kg urun toplamini yazdirmak icin
    public Domates(double domatesFiyat, double alinanKg, double urunToplam) {
        super(domatesFiyat);
        this.alinanKg = alinanKg;
        this.urunToplam = urunToplam;
    }

    public Domates() {

    }

    public double getAlinanKg() {
        return alinanKg;
    }

    public void setAlinanKg(double alinanKg) {
        this.alinanKg = alinanKg;
    }

    public double getUrunToplam() {
        return urunToplam;
    }

    public void setUrunToplam(double urunToplam) {
        this.urunToplam = urunToplam;
    }

    @Override
    public String toString() {
        return "Domates{" +
                "alinanKg=" + alinanKg +
                ", urunToplam=" + urunToplam +
                "} ";
    }
}