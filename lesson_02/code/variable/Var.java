package variable;

public class Var {
    public static void main(String[] args) {

//          комментарий к коду - закомментировать строку Ctrl + /
//        дублирование строки - Ctrl + D
//        Шаблон для вывода System.out.println() - sout + Tab
//        Шаблон для метода main - psvm + Tab или main + Tab

        // все имена переменных начинаются с маленькой буквы
        int myFirstVariable; // декларация (объявление) переменной
//        какие-то строки кода
        myFirstVariable = 25; // инициализация переменной (присвоение значения)

        int mySecondVariable = 2;


        System.out.println("my first variable: " + myFirstVariable); //выводим значение переменной на экран
        System.out.println(mySecondVariable); //выводим значение переменной на экран

        // объявляем и инициализируем переменную типа byte
        byte byteVariable = 25;

        // объявляем переменную типа short
        short shortVariable;
        shortVariable = 32000;

        // объявляем и инициализируем переменную типа long
        long longVariable = 222_222_000_000_000L;
        System.out.println(longVariable); //выводим значение переменной на экран

        // объявляем переменную типа double
        double doubleVar;
        doubleVar = 1.50; // присваиваем значение
        doubleVar = 1.5665; // присваиваем новое значение
        System.out.println(doubleVar); //выводим значение переменной doubleVar на экран

//        Выравнивание кода: Ctrl + Alt + L

    }
}
