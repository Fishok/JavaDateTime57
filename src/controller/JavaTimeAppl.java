package controller;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class JavaTimeAppl {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local date " + localDate);
        System.out.println("Local time " + localTime);
        System.out.println("Local date and time " + localDateTime);


        //fsgfrfdgf


        //Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.parse("07/11/2024", formatter);
        System.out.println(today);
        System.out.println("Formatted Date: " + today.format(formatter));
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Formatted Date: " + localDateTime.format(formatter));

        //Adding and Subtracting time

        LocalDate date = LocalDate.now().plusDays(5);
        LocalDateTime dateTime = LocalDateTime.now().minusHours(2);
        System.out.println("Date after 5 days: " + date);
        System.out.println("DateTime 2 hours ago: " + dateTime);

        //Calculating the difference between two dates

        LocalDate startDate = LocalDate.of(2023, 10, 1);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println("Difference + " + period.getYears() + " years, "
                + period.getMonths() + " months, " + period.getDays() + " days");

        ZonedDateTime dateTimeInUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime dateTimeInNYC = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current DateTime in UTC: " + dateTimeInUTC);
        System.out.println("Current DateTime in NYC: " + dateTimeInNYC);


        //Converting between LocalDateTime and Instant

        dateTime = LocalDateTime.now();
        Instant instant = dateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("LocalDateTime: " + dateTime);
        System.out.println("Instant: " + instant);

        //Using Periods and Durations
        period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        System.out.println("Period " + period);
        System.out.println("Duration " + duration);

        //Checking if a date or time is before of after another
        LocalDate date1 = LocalDate.of(2023, 11, 1);
        LocalDate date2 = LocalDate.of(2024, 11, 1);

        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(12, 45);
        System.out.println("Date 1 is before Date 2: " + date1.isBefore(date2));
        System.out.println("Time 1 is before Time 2: " + time1.isAfter(time2));

        //Using Temporal Adjusters for custom date adjustments

//        dngfkjfngkj

        LocalDate now = LocalDate.now();
        LocalDate nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Next Sunday: " + nextSunday);

        //Getting the day, month or year
        date = LocalDate.now();
        System.out.println("Day of month " + date.getDayOfMonth());
        System.out.println("Day of week " + date.getDayOfWeek());
        System.out.println("Day of year " + date.getDayOfYear());
        System.out.println("Month:  " + date.getMonthValue());
    }
}
