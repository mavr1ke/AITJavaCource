package lesson_65.multi_threading;

public class OurRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
    }
}
