package homewwork_67.deadlock;

public class Person {

    //   deadlock -  это ситуация когда один поток ждет действий от второго а второй
    // поток ждет первый и в результате ни один не выполняется
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void howAreYouDoing(Person person) throws InterruptedException {
        synchronized (this) {
            System.out.println("How are you doing, " + person.name + "?");
            Thread.sleep(1000);
        }
    }

    public void iAmFineThanksAndYou(Person person) {
        synchronized (this) {
            System.out.println("I am fine, " + person.name + ", thanks, and you?");
        }
    }

    public static void main(String[] args) {
        final Person john = new Person("John");
        final Person peter = new Person("Peter");

        Thread thread1 = new Thread(() -> {
            try {
                john.howAreYouDoing(peter);
                peter.iAmFineThanksAndYou(john);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                peter.howAreYouDoing(john);
                john.iAmFineThanksAndYou(peter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
