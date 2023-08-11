package lesson_19;

public class Cat {
    private String name;
    private double weight;
    private int age;

    public Cat(String catName, double weight, int age) {
        name = catName;
        this.weight = weight;
        setAge(age);
    }

    public Cat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String string) {
        this.name = string;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }
    }

    private void startTraining(int laps) {
        System.out.println("Старт тренировки с  " + laps + " кругами");

        for (int i = 0; i < laps; i++) {
            System.out.println("Круг № " + (i+1));
            run();  // ==> this.run();
            System.out.println("end lap \n");
        }
    }

    public void startRunning(int laps) {
        startTraining(laps);
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
        System.out.println("Я котик " + name + " и я вешу " + weight + "кг, мой возраст "+ age +". Мяу!");
    }
}
