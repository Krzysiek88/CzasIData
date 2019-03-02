package Zadanie3;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        Period period = Period.between(LocalDate.of(1988, 7, 28), localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy*MM:*dd");
        System.out.println("Period: " + period.getYears() +" "+ "lat, " + period.getMonths()+ " " + "miesięcy, "
                + period.getDays()+ " " + "dni.");






    }
}
