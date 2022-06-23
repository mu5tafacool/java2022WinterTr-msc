package src.java_Batch_59_QA.day36_inheritance;

public class Muhasebe extends Personel{

    protected int saatUcreti;
    protected  String statu;
    protected int maas=8;


    protected int maasHesapla(){
        int maas=saatUcreti*8*30;
        return maas;
    }

}