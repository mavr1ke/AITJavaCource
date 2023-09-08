package lesson_38.test_perfomance;

import java.util.List;

public class ListPerformanceTester {

    private final ListOperationsStrategy strategy;

    public ListPerformanceTester(ListOperationsStrategy strategy) {
        this.strategy = strategy;
    }

    public long testAppendPerformance(int nTimes) {
        long now = System.currentTimeMillis();
        strategy.append(nTimes);
        return System.currentTimeMillis() - now;
    }

    public long testGetPerformance(int nTimes, int length) {
        List list = strategy.getFilledList(length);
        long now = System.currentTimeMillis();
        strategy.get(nTimes, list);
        return System.currentTimeMillis() - now;
    }
}
