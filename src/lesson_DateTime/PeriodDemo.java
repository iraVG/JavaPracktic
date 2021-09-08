package lesson_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
//        Period period5y4m3d = Period.of(5, 4, 3);
//        Period period2d = Period.ofDays(2);
//        Period period2m = Period.ofMonths(2);
//        Period period14d = Period.ofWeeks(2);
//        Period period2y = Period.ofYears(2);
//
//        System.out.println(period5y4m3d);
//        System.out.println(period2d);
//        System.out.println(period2m);
//        System.out.println(period14d);
//        System.out.println(period2y);
//        System.out.println("==================================================================");
//
//        System.out.println("період різниця між двома LocalDate");
//        LocalDate march2003 = LocalDate.of(2003, 3, 1);
//        LocalDate may2003 = LocalDate.of(2003, 5, 1);
//        Period dif = Period.between(march2003, may2003);
//        System.out.println(dif);
//
//        System.out.println("==================================================================");
//
//        System.out.println("використання методу get()");
//      //  Period period5y4m3d = Period.of(5, 4, 3);
//        int days = period5y4m3d.getDays();
//        int months = period5y4m3d.getMonths();
//        int year = period5y4m3d.getYears();
//
//
//        System.out.println("Дни: " + days);
//        System.out.println("Месяца: " + months);
//        System.out.println("Годы: " + year);
//
//        System.out.println("==================================================================");
//
//        System.out.println("використання методу with()");
//        Period period3d = Period.ofDays(3);
//        Period period8d = period2d.withDays(8);
//        Period period2y1m3d = period3d.withYears(2).withMonths(1);
//
//        System.out.println(period2d);
//        System.out.println(period8d);
//        System.out.println(period2y1m3d);
//        System.out.println("==================================================================");

        System.out.println("використання методу plus() i minus");
        Period period5y4m3d = Period.of(5, 4, 3);
        Period period2y = Period.ofYears(2);
        // Додавання
        System.out.println(period5y4m3d.plusYears(4));
        System.out.println(period5y4m3d.plusMonths(3));
        System.out.println(period5y4m3d.plusDays(3));
        System.out.println(period5y4m3d.plus(period2y));

        // віднімання
        System.out.println(period5y4m3d.minusYears(2));
        System.out.println(period5y4m3d.minusMonths(1));
        System.out.println(period5y4m3d.minusDays(1));
        System.out.println(period5y4m3d.minus(period2y));

    }
}
