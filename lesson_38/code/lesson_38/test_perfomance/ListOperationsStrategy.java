package lesson_38.test_perfomance;

import java.util.List;

public interface ListOperationsStrategy {

    void append(int nTimes);
    List getFilledList(int length);
    void get(int nTimes, List list);
}
