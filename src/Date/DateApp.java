package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateApp {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2021, Month.AUGUST, 1);
        LocalDate.of(2021, 8, 1);

        LocalTime time1 = LocalTime.of(11, 11);
        LocalDateTime.of(2011, Month.AUGUST, 11, 11, 11);

        LocalDateTime.of(date1, time1);


        LocalDate date2 = LocalDate.of(2022, Month.JULY, 1);
        date2.isAfter(date1);
        date2.isBefore(date1);
        date2 = date2.plusDays(10);
        date2 = date2.plusMonths(2);
        date2 = date2.plusYears(1);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);



    }
}
