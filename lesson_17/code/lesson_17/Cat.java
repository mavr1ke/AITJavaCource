package lesson_17;

public class Cat {
    String name;
    double weight;


    public Cat(String catName, double weight) {
        name = catName;
        this.weight = weight;
    }

    void startTraining(int laps) {
        System.out.println("Старт тренировки с  " + laps + " кругами");

        for (int i = 0; i < laps; i++) {
            System.out.println("Круг № " + (i+1));
            run();  // ==> this.run();
            System.out.println("end lap \n");
        }
    }

    void run() {
        while (weight <= 2) {
            System.out.println("Я слишком голоден и слишком худой! Бегать не могу!! мой вес " + weight);
            eat();
            System.out.println("мой вес после еды " + weight);
        }
        System.out.println("Я бегу! Ох, как тяжело...( " + weight);
        weight -= 2;
    }

    void eat() {
        System.out.println("Я кушаю!");
        weight++;
    }

    void whoAmI() {
        System.out.println("Я котик " + name + " и я вешу " + weight + "кг. Мяу!");
    }
}
