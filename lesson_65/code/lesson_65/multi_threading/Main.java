package lesson_65.multi_threading;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        System.out.println("Main thread started");
        MultiDemo multiDemo1 = new MultiDemo("OurThread1");
        MultiDemo multiDemo2 = new MultiDemo("OurThread2");
        multiDemo1.start();
        multiDemo2.start();
        for(int i = 3; i < 10; i++) {
            new MultiDemo("OurThread" + i).start();
        }

                OurThread ourThreadRunnable = new OurThread("FromRunnable#1");
                Thread newThread = new Thread(ourThreadRunnable);
                newThread.start();
                for(int i = 0; i < 30; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("Main is interrupted ");
                    }
                }

        Thread thread1 = new Thread(new OurRunnable(), "Another Example");
        thread1.start();

        MultiDemo multiDemos1 = new MultiDemo("Demos#1");
        MultiDemo multiDemos2 = new MultiDemo("Demos#2");
        MultiDemo multiDemos3 = new MultiDemo("Demos#3");

        multiDemos1.start();
        multiDemos2.start();
        multiDemos3.start();

        do {
            System.out.print(".");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Main interrupted");
            }
        } while (multiDemos1.isAlive() || multiDemos2.isAlive() || multiDemos3.isAlive());


        MultiDemo multiDemos4 = new MultiDemo("Demos#4");
        MultiDemo multiDemos5 = new MultiDemo("Demos#5");
        MultiDemo multiDemos6 = new MultiDemo("Demos#6");

        multiDemos4.start();
        multiDemos5.start();
        multiDemos6.start();

        multiDemos4.join();
        multiDemos5.join();
        multiDemos6.join();

        System.out.println("Main thread finishing");

    }
}
