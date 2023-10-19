package lesson_66.daemon_threads;

public class Main {
    // Daemon thread
    // void setDaemon(boolean status) - для первращения потока  в daemon и наоборот
    // boolean isDaemon() -  проверяет статус
    public static void main(String[] args) {


        DaemonThreadsExample example1 = new DaemonThreadsExample();
        DaemonThreadsExample example2 = new DaemonThreadsExample();

        example1.setDaemon(true);

        example1.start();
        example2.start();
    }
}
