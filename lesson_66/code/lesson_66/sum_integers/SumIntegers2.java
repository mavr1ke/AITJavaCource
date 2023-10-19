package lesson_66.sum_integers;

public class SumIntegers2 implements Runnable{

    int counter = 0;

    public void run(){
        for( int i = 0; i <1000; i++){
            counter++;
        }
    }
}
