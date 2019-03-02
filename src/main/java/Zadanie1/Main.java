package Zadanie1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        String komenda;


        do {
            System.out.println("Podaj komendę:");

            komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("dataiczas")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM*dd*yyyy HH-mm");
                System.out.println(LocalDateTime.now().format(formatter));
            } else if (komenda.equalsIgnoreCase("data")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM*dd*yyyy");
                System.out.println(LocalDate.now().format(formatter));
            } else if (komenda.equalsIgnoreCase("czas")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm");
                System.out.println(LocalTime.now().format(formatter));
            }


        }while (!komenda.equalsIgnoreCase("Quit")) ;


    }
}




