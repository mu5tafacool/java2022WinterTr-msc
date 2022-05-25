package src.trial_Deneme;

public class CarMain {

   private String yil;
   private String model;

    public CarMain(String yil, String model) {
        this.yil = yil;
        this.model = model;
    }

    public String getYil() {
        return yil;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarMain{" +
                "yil='" + yil + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
