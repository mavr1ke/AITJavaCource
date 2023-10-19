package lesson_66.sum_integers;

public class Demo {
    public static void main(String[] args) throws Exception {


        //  создаем новый поток используя класс Thread
        SumIntegers sum = new SumIntegers();
        sum.start();
        sum.join();


        System.out.println(sum.getCounter());

        //  создаем новый поток с помощью интерфейса Runnable
        SumIntegers2 sumIntegers2 = new SumIntegers2();
        Thread t = new Thread(sumIntegers2);
        t.start();


    }
}
