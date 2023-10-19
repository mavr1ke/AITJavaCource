package lesson_66.daemon_threads;

public class DaemonThreadsExample extends Thread{

    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread executing");
        }
        else {
            System.out.println("normal thread is executing");
        }
    }

}
