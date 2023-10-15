package lesson_62.datetime_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(13, 35, 20);
        System.out.println(localTime1);
        System.out.println(localTime1.getHour());
        System.out.println(localTime1.getMinute());
        System.out.println(localTime1.getSecond());

        LocalTime newLocalTime = LocalTime.of(17, 15, 34, 1111111);
        System.out.println(newLocalTime.plusHours(2));
        System.out.println(newLocalTime.plusMinutes(10));
        System.out.println(newLocalTime.plusSeconds(10));
        System.out.println(newLocalTime);

        System.out.println(newLocalTime.minusHours(1));

        LocalTime timeToCheck = LocalTime.of(13, 25);
        System.out.println(timeToCheck.isBefore(LocalTime.now()));
        System.out.println(timeToCheck.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        LocalDate localDate = LocalDate.of(2023, 1, 10);
        System.out.println(localDate);
        System.out.println(LocalDate.now());
        LocalDate dateNow = LocalDate.now();

        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(dateNow.isBefore(localDate));
        System.out.println(dateNow.isAfter(localDate));

        System.out.println(dateNow.lengthOfMonth());
        System.out.println(dateNow.lengthOfYear());

        System.out.println(dateNow.getDayOfWeek());
        System.out.println(dateNow.getDayOfMonth());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.of(2000, 10, 1, 10, 15));
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        LocalDateTime now = LocalDateTime.now();
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZonedDateTime inBerlin = ZonedDateTime.of(now, berlin);
        System.out.println(inBerlin);

        inBerlin = ZonedDateTime.now(berlin);
        System.out.println(inBerlin);

//        Iterator<String> iterator = availableZoneIds.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println();
        LocalDate nowDate = LocalDate.now();
        LocalDate finalDate = nowDate.plus(Period.ofDays(5));
        System.out.println(finalDate);

        int fiveDays = Period.between(nowDate,finalDate).getDays();
        System.out.println(fiveDays);

        System.out.println(ChronoUnit.DAYS.between(nowDate, finalDate));

        LocalTime initTime = LocalTime.of(10,30,0);
        LocalTime finalTime = initTime.plus(Duration.ofHours(2));
        System.out.println(Duration.between(initTime, finalTime).getSeconds());

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = dateTimeFormatter.format(localDateTime1);
        System.out.println(formatted);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String formatted1 = dateTimeFormatter1.format(localDateTime1);
        System.out.println(formatted1);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formatted2 = dateTimeFormatter2.format(localDateTime1);
        System.out.println(formatted2);

        DateTimeFormatter ourFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        localDateTime1 = LocalDateTime.now();
        String res = localDateTime1.format(ourFormatter);
        System.out.println(res);

        LocalDateTime localDateTime2 = LocalDateTime.parse(res,ourFormatter);
        System.out.println(localDateTime2);
    }
}
