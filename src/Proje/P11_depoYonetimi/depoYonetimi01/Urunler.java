package src.Proje.P11_depoYonetimi.depoYonetimi01;

public class Urunler {//pojo model class

    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;
    /** 2*projenin calisacagi objeleri prvite olarak pojo model class yaptik*/

    public Urunler() {
    }
    /** 3* bos constructor olusturduk*/
    public Urunler(String urunIsmi, String uretici, int miktar, String birim, String raf) {
    /** 4* elementli constructor olusturduk*/
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    /** 5* element urunler icin get set medodlari; yazdirmak icin toString yaptik */
    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urunleriniz" +

                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' + "\n"
                ;
    }
}
