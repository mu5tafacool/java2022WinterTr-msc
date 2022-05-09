package src.trial_Deneme;

public class KisiBilgisiClass {
    String ad ;
    String soyad;

    String tel;

    String adres;
    String yas ;




    public KisiBilgisiClass(String ad, String soyad, String yas, String tel, String adres) {
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "KisiBilgisiClass{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tel='" + tel + '\'' +
                ", adres='" + adres + '\'' +
                ", yas='" + yas + '\'' +
                '}';
    }

    public KisiBilgisiClass() {
    }
}
