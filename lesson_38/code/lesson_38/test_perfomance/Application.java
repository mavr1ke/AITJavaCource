package lesson_38.test_perfomance;

public class Application {

    public static void main(String[] args) {

        ListOperationsStrategy arrayStrategy = new ArrayListOperationStrategy();
        ListOperationsStrategy linkedStrategy = new LinkedListOperationStrategy();

        ListPerformanceTester arrayTester = new ListPerformanceTester(arrayStrategy);
        ListPerformanceTester linkedTester = new ListPerformanceTester(linkedStrategy);

        System.out.println("Test append performance");

        System.out.println(arrayTester.testAppendPerformance(10_000_000));
        System.out.println(linkedTester.testAppendPerformance(10_000_000));

        System.out.println("Test get performance");

        System.out.println(arrayTester.testGetPerformance(1_000_000,1000));
        System.out.println(linkedTester.testGetPerformance(1_000_000,1000));
    }
}
