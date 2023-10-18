package homework_65;

public class HWMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printChar('#'));
        Thread thread2 = new Thread(() -> printChar('*'));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end of main");
    }

    public static void printChar(char ch) {
        for (int i = 0; i < 100; i++) {
            System.out.println(ch);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

