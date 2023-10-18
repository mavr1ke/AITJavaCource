package lesson_65.multi_threading;

public class MultiDemo extends Thread{


    public MultiDemo(String name) {
        super(name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try{
            Thread.sleep(600);
        } catch (InterruptedException e) {
            System.out.println("The thread has been interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
