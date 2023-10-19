package lesson_66.atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

public class OurAtomicInteger {
    public static void main(String[] args) throws InterruptedException

    {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger);

        AtomicInteger atomicInteger1 = new AtomicInteger(123);
        System.out.println(atomicInteger1);

        //  получить значение
        int value = atomicInteger1.get();
        System.out.println(value);

        //  установить значение
        atomicInteger1.set(456);

        //добавить значение
        AtomicInteger atomicInteger2 = new AtomicInteger(1);
        System.out.println(atomicInteger2.getAndAdd(10));
        System.out.println("atomicInteger2 now is " + atomicInteger2.get());
        System.out.println(atomicInteger.addAndGet(10));


        atomicInteger.incrementAndGet();
        atomicInteger.getAndIncrement();

        final Counter counter = new Counter();

        for( int i = 0; i < 1000; i++){

            new Thread(counter::increment).start();
        }
        Thread.sleep(3000);

        System.out.println("Final number(should be 1000): " + counter.value());

    }
}
