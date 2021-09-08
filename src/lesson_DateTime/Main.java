package lesson_DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        System.out.println("********Отримання року, місяця та дня місяця*******");
        LocalDate today = LocalDate.now();

        int year = today.getYear();
        int month = today.getMonthValue();
        Month monthAsEnum = today.getMonth(); // как перечисление
        int dayYear = today.getDayOfYear();
        int dayMonth = today.getDayOfMonth();
        DayOfWeek dayWeekEnum = today.getDayOfWeek(); // как перечисление

        System.out.println("Рік: " + year);
        System.out.println("Місяць: " + month);
        System.out.println("Назва місяца: " + monthAsEnum);
        System.out.println("День в році: " + dayYear);
        System.out.println("День місяця: " + dayMonth);
        System.out.println("День тижня: " + dayWeekEnum);
        System.out.println("=========================================================================================");


//        System.out.println("********Порвняння дат******************************");
//        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
//        LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);
//
//        boolean after = newYear2001.isAfter(newYear2002);
//        boolean before = newYear2001.isBefore(newYear2002);
//        boolean equal = newYear2001.equals(newYear2002);
//        boolean leapYear = newYear2001.isLeapYear();
//
//        System.out.println("newYear2001.isAfter(newYear2002): " + after);
//        System.out.println("newYear2001.isBefore(newYear2002): " + before);
//        System.out.println("newYear2001.equals(newYear2002): " + equal);
//        System.out.println("newYear2001.isLeapYear(): " + leapYear);
//
//
//        System.out.println("=========================================================================================");

//        System.out.println("method with() для зміни окремо року, дня чи місяця");
//        LocalDate newYear2020 = LocalDate.of(2020, 1, 1);
//
//        LocalDate newYear2024 = newYear2020.withYear(2024);
//        LocalDate december2020 = newYear2020.withMonth(12);
//        LocalDate february2020 = newYear2020.withDayOfYear(32);
//        LocalDate xmas2020 = newYear2020.withMonth(12).withDayOfMonth(25);
//
//        System.out.println("newYear2024 " + newYear2024);
//        System.out.println("december2020 " + december2020);
//        System.out.println("february2020 " + february2020);
//        System.out.println("xmas2020 " + xmas2020);
//        System.out.println("=========================================================================================");
////
        System.out.println("Методи plus(), " +
                "minus()використовуються для додавання або віднімання року, місяця або дня");

        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        LocalDate newYear2005 = newYear2001.plusYears(4);
        LocalDate march2001 = newYear2001.plusMonths(2);
        LocalDate january15Year2001 = newYear2001.plusDays(14);
        LocalDate lastWeekJanuary2001 = newYear2001.plusWeeks(3);

        LocalDate newYear2000 = newYear2001.minusYears(1);
        LocalDate nov2000 = newYear2001.minusMonths(2);
        LocalDate dec30Year2000 = newYear2001.minusDays(2);
        LocalDate lastWeekDec2001 = newYear2001.minusWeeks(1);


        System.out.println("newYear2005: " + newYear2005);
        System.out.println("march2001: " + march2001);
        System.out.println("january15Year2001: " + january15Year2001);
        System.out.println("lastWeekJanuary2001: " + lastWeekJanuary2001);

        System.out.println("newYear2000: " + newYear2000);
        System.out.println("nov2000: " + nov2000);
        System.out.println("dec30Year2000: " + dec30Year2000);
        System.out.println("lastWeekDec2001: " + lastWeekDec2001);


    }
}
