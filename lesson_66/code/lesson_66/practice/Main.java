package lesson_66.practice;

public class Main {
    /*
    Сотрудники банка выдают кредиты. У каждого есть диапазон по времени - максимальное время и минимальное время которое
    требуется сотруднику для выдачи кредита. ( minTime, maxTime) . Но среди них есть сотрудник/сотрудники, у которых
    вдруг возрастает работоспособность и они начинают выдавать кредиты быстрее, а затем опять скорость может снижатьс до
    обычной.
    Посчитать время, за которое каждый сотрудник выдаст N  кредитов

    1. создать классы:
    -   абстрактный класс AbstractClerk
    -   дочерние классы RegularClerk, LazyInspiredClerk
    2. Должна быть возможность на основе классов создавать потоки. Т.е. родительский класс  должен реализовывать Runnable
     */

    public static void main(String[] args) {
        RegularClerk regularClerk = new RegularClerk("Обычный сотрудник", 5, 10, 10);
        LazyInspiredClerk inspiredClerk = new LazyInspiredClerk("Вдохновленный сотрудник", 3, 8, 10, 2.0);

        Thread thread1 = new Thread(regularClerk);
        Thread thread2 = new Thread(inspiredClerk);

        thread1.start();
        thread2.start();

        // Ждем завершения потоков
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Получаем время завершения для каждого сотрудника
        long finishTimeRegularClerk = regularClerk.getFinishTime();
        long finishTimeInspiredClerk = inspiredClerk.getFinishTime();

        System.out.println("Время завершения обычного сотрудника: " + finishTimeRegularClerk);
        System.out.println("Время завершения вдохновленного сотрудника: " + finishTimeInspiredClerk);
    }
}
