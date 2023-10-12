package homework_62;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
public class HWMain {
    public static void main(String[] args) {
        // Текущая дата
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        // Текущий год, месяц и день
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);

        // Создание даты (например, день рождения) и вывод
        LocalDate birthday = LocalDate.of(2000, 5, 15);
        System.out.println("День рождения: " + birthday);

        // Создание двух дат и проверка на равенство
        LocalDate date1 = LocalDate.of(2023, 10, 12);
        LocalDate date2 = LocalDate.of(2023, 10, 12);
        boolean datesAreEqual = date1.isEqual(date2);
        System.out.println("Даты равны: " + datesAreEqual);

        // Текущее время
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);

        // Текущее время + 3 часа
        LocalTime newTime = currentTime.plusHours(3);
        System.out.println("Текущее время + 3 часа: " + newTime);

        // Дата на неделю позже
        LocalDate nextWeek = currentDate.plusWeeks(1);
        System.out.println("Дата на неделю позже: " + nextWeek);

        // Дата на год раньше
        LocalDate oneYearAgo = currentDate.minusYears(1);
        System.out.println("Дата на год раньше: " + oneYearAgo);

        // Дата на год позже
        LocalDate oneYearLater = currentDate.plusYears(1);
        System.out.println("Дата на год позже: " + oneYearLater);

        // Создание дат tomorrow и yesterday
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Yesterday: " + yesterday);

        // Метод для вычисления разницы в днях между самой ранней и поздней датами в списке
        List<LocalDate> dates = List.of(LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 15), LocalDate.of(2023, 10, 5));
        int daysDifference = getDaysDifference(dates);
        System.out.println("Разница в днях между самой ранней и поздней датами: " + daysDifference);
    }

    public static int getDaysDifference(List<LocalDate> dates) {
        if (dates.isEmpty()) {
            return 0;
        }

        LocalDate minDate = dates.get(0);
        LocalDate maxDate = dates.get(0);

        for (LocalDate date : dates) {
            if (date.isBefore(minDate)) {
                minDate = date;
            }
            if (date.isAfter(maxDate)) {
                maxDate = date;
            }
        }

        return minDate.until(maxDate).getDays();
    }
}
