package Deneme.ArabaEncapsul;

public class Araba {

    int yil;
    int cc;
    String model;

    public Araba(int yil, String model) {
        this.yil = yil;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "yil=" + yil +
                ", cc=" + cc +
                ", model='" + model + '\'' +
                '}';
    }

    public Araba(int yil, int cc) {
        this.yil = yil;
        this.cc = cc;
    }

    public Araba(String model) {
        this.model = model;
    }

    public Araba() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
