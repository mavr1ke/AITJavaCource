package lesson_66.atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter  {

    private final AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.getAndIncrement();
    }

    public int value(){
        return count.get();
    }
}
