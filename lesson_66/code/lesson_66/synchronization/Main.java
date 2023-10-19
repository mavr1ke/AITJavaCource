package lesson_66.synchronization;

public class Main {
    public static void main(String[] args) {
        CounterCommon counterCommon = new CounterCommon();

        for(int i = 1; i < 5;i++){
            Thread thread = new Thread(new ThreadCount(counterCommon),"Child "+i);
            thread.start();
        }

    }
}
