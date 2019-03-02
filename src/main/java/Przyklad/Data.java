package Przyklad;

import java.time.*;
import java.util.SortedMap;

public class Data {
    public static void main(String[] args) {
        // Date date = new Date();              stara metoda, zniknie w kolejnych wersjach javy
       // System.out.println(date);

        LocalDateTime localDateTime = LocalDateTime.now(); // pobranie daty i godziny i przypisanie do zmiennej


        LocalDate localDate = LocalDate.now();          // pobranie daty



        LocalTime localTime = LocalTime.now();              // pobrinae godziny



       // Timiestamp - czas w minisekundach od 1 stycznia 1970.

        Long czas = System.currentTimeMillis();


        //okres czasu - wyrazony w latach
        Period period = (Period) Period.between(LocalDate.of(1410,7,14), localDate);
        System.out.println(period);
        System.out.println("Period: " + period.getYears() + "lat"); //etc

        //czas od rozpoczęcia zajeć
        Duration duration = Duration.between(LocalDateTime.of(2019,2,16,9,0),localDateTime);
        System.out.println(duration);
        System.out.println("Duration: " + duration.getSeconds() / 60);

    }
}
