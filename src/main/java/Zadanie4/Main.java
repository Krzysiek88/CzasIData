package Zadanie4;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data1;
        String data2;

        System.out.println("Podaj pierwszą datę");
        data1 = scanner.nextLine();
        System.out.println("Podaj drugą datę");
        data2 = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        LocalDateTime ldt1 = LocalDateTime.parse(data1,formatter);
        LocalDateTime ldt2 = LocalDateTime.parse(data2,formatter);


        Period period = Period.between(ldt1.toLocalDate(), ldt2.toLocalDate());
        System.out.println("Period: " + period.getYears()
                + "lat, " + period.getMonths() + "miesięcy"
                + period.getDays() + "dni.");

    }
}
