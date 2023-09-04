package lesson_35.lambda_expressions;

public class AnotherExample {

    public static int x = 1;
    public static int y = 2;

    public static void main(String[] args) {

        Summable summable = () -> {
            x = 3;
            return x + y;
        };

        System.out.println(summable.calculate());
        System.out.println(x);

        int a = 6;
        int b = 4;

        Summable summable1 = () -> {
            //a = 8;
            return a + b;
        };

        System.out.println(summable1.calculate());

        SummableGeneral<Integer> sumDigits = (x, y) -> x + y;
        SummableGeneral<String> sumStrings = (x, y) -> x + y;
        System.out.println(sumDigits.calculate(1,2));
        System.out.println(sumStrings.calculate("1","2"));
    }
}
