package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class MyTestCalendarPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하새요: ");
        int month = scanner.nextInt();

        showCalendar(year, month);
    }

    private static void showCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);

        System.out.println("Su Mo Tu We Th Fr Sa");

        DayOfWeek start = date.getDayOfWeek();
        System.out.println(start);

    }
}
