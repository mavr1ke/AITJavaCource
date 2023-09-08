package lesson_38.test_perfomance;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListOperationStrategy implements ListOperationsStrategy{

    private static final Object object = 10;
    private Random random = new Random();
    @Override
    public void append(int nTimes) {
        List list = new LinkedList();
        for (int i = 0; i < nTimes; i++) {
            list.add(object);
        }
    }

    @Override
    public List getFilledList(int length) {
        List list = new LinkedList();

        for (int i = 0; i < length; i++) {
            list.add(object);
        }
        return list;
    }

    @Override
    public void get(int nTimes, List list) {
        int length = list.size();

        for (int i = 0; i < nTimes; i++) {
            list.get(random.nextInt(length));
        }
    }
}
