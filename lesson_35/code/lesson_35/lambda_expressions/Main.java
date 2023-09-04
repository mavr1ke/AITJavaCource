package lesson_35.lambda_expressions;

public class Main {
    public static void main(String[] args) {
//        () -> 100.0;
//        () -> Math.random() * 1000;
//        (n) -> 2.0 / n;
//        (n) -> (n % 2) == 0;
//        n -> 1/n;

        OurValue ourValue;
        ourValue = () -> 100.0;
//        ourValue = () -> "str";
        System.out.println("value is: " + ourValue.getValue());

        OurParamValue ourParamValue = n -> 2.0 / n;
        System.out.println("value with param is: " + ourParamValue.getValue(4.0));
//        ourParamValue = () -> 100.0;

        OurTestInterface isDivided;
        isDivided = (a, b) -> (a % b) == 0;
        System.out.println("a is divided by b without remainder? " + isDivided.Test(10, 2));

        OurTestInterface isMore;
        isMore = (a, b) -> a > b;
        System.out.println("a > b? " + isMore.Test(10, 2));

        OurTestInterface isEqual;
        isEqual = (a, b) -> a == b;
        System.out.println("a == b? " + isEqual.Test(10, 2));

        StringTestInterface isPart;
        isPart = ((str1, str2) -> str1.indexOf(str2) != -1);
        String str1 = "This is a test";
        System.out.println(isPart.test(str1,"is"));


        StringTestInterface isEqualStr;
        isEqualStr = (a,b) -> a.equals(b);
        System.out.println(isEqualStr.test("qwertz", "qwerty"));

        NumericInterface smallestDivider = n -> {

            int res = 1;

            n = n < 0 ? -n : n;

            for (int i = 2; i <= n;i++){
                if(n % i == 0) {
                    res = i;
                    break;
                }
            }
            return res;
        };
    }

//    public double return100() {
//        return 100.0;
//    }
}
