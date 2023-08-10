package homework_17;

public class DogMain {
    public static void main(String[] args) {

       /*
       Написать класс собака
       Собака должна иметь имя, высоту прыжка
       Должна уметь прыгать и должна уметь тренироваться. За каждую тренировку высота прыжка увеличивается на 10 сантиметров
       Максимальная высота, которую может натренировать собака не может быть больше, чем 2раза высоту первоначального прыжка.

        */

        Dog dog1 = new Dog("Barbos", 50);

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

        System.out.println("=============");
        System.out.println("jumpHeight " + dog1.jumpHeight);
        System.out.println("maxJumpHeight " + dog1.maxJumpHeight);

        System.out.println("=========== Rax =============");
        Dog dog = new Dog("Rax", 153);

        System.out.println(dog.jumpHeight);
        System.out.println(dog.maxJumpHeight);

//        int barrier = 120;
//        dog.getBarrier(barrier);
//
//        barrier = 180;
//        dog.getBarrier(barrier);

        int countBarriers = 0;
        int[] barriers = {120, 180, 160, 280, 350, 50, 304};
        for (int barrier: barriers) {
           if (dog.getBarrier(barrier)) {
               countBarriers++;
           }
        }
        System.out.println("\nКоличетсво перепрыгнутых барьеров: " + countBarriers);

        // массивы обьетков
        Dog[] dogs = new Dog[3];
        Dog[] dogs2 = {new Dog("rax", 24), new Dog("lol", 242)};
    }
}
