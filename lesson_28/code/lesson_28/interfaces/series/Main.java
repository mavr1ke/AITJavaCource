package lesson_28.interfaces.series;

public class Main {
    public static void main(String[] args) {

        Twice twice = new Twice();

        for (int i = 0; i < 5; i++) {
            System.out.println("next value is " + twice.getNext());
        }

        System.out.println("\nReset value");
        twice.reset();

        for (int i = 0; i < 5; i++) {
            System.out.println("next value is " + twice.getNext());
        }

        System.out.println("\nStart at 10");
        twice.setStart(10);

        for (int i = 0; i < 5; i++) {
            System.out.println("next value is " + twice.getNext());
        }

        System.out.println("\nFourth");
        Fourth fourth = new Fourth();

        for (int i = 0; i < 5; i++) {
            System.out.println("next value is " + fourth.getNext());
        }

        Series seriesTwice = new Twice();

        Twice twice1 = new Twice();
        Fourth fourth1 = new Fourth();

        printSeries(twice1);
        printSeries(fourth1);

    }

    public static void printSeries(Series series){
        System.out.println(series.getNext());
    }
}
