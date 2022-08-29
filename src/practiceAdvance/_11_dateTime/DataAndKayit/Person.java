package src.practiceAdvance._11_dateTime.DataAndKayit;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Person {

    String name;
    LocalDateTime registTime;
    int bornYear;
    String iD;

    //Gerekli ojeler ad yil zaman gibi

    public Person() {
        //bu parametresizi bulunsun diye atiyoruz
    }

    public Person(String iD, String name, int bornYear, LocalDateTime registTime) { //id li
        this.name = name;
        this.registTime = registTime;
        this.bornYear = bornYear;
        this.iD = iD;
    }

    public Person(String name, int bornYear, LocalDateTime registTime) {
        this.name = name;
        this.registTime = registTime;
        this.bornYear = bornYear;
    }
}
