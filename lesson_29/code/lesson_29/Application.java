package lesson_29;

public class Application {
    /*
     1. Создать класс Car, содержащий общие характеристики машин:
    model, manufacturer, year, colour
   2. Создать дочерние классы PassengerCar  и Truck, расширяющие Car
   3. Создать интерфейс Movable, содержащий методы move  и stop
   3. Также создать класс Kangaroo
   4. Общее поведение классов должно характеризоваться методами move  и stop
   5.   Класс Truck должен иметь также свои дополнительные характеристики и поведение, важное для грузовика,
    а именно: макс. грузоподьемность, обьем топливного бака. Поведение грузовика:
    - должен уметь загружаться (load)  и при этом сообщать если превышена его грузоподьемность, а также сообщать
        сколько еще можно загрузить груза
    - должен уметь разгружаться и при этом сообщать в случае если пытаются разгрузить больше чем его имеющийся груз
        или число отрицательное а также сообщать о весе остающегося на борту груза
    - в случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
    - уметь дозаправляться
    */

    public static void main(String[] args) {
        Movable kangaroo = new Kangaroo();
        System.out.println(kangaroo);

        kangaroo.move();
        kangaroo.stop();
        Car passengerCar = new PassengerCar("XC90", "Volvo", 2020, "Red");
        //Movable passengerCarMov = new PassengerCar("car","Mercedes",2021,
        //          "ed");

        passengerCar.move();
        passengerCar.stop();

        // Car truckCar = new Truck("Truck","MAN",2020,"black",
        //         5000,100);
        Truck truck = new Truck("SuperTruck", "Volvp", 2019, "black-yellow",
                5000, 500);

        System.out.println(truck);
        truck.move();
        truck.load(2000);
        truck.move();
        truck.setCurrentFuel(200);
        truck.move();
        truck.stop();
        truck.load(4000);
        truck.unload(10000);
        truck.unload(1000);
    }
}
