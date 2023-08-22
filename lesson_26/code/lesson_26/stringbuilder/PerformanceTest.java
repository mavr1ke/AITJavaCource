package lesson_26.stringbuilder;

public class PerformanceTest {

    public static String concatString() {
        String str = "Hello";

        for (int i = 0; i < 10_000; i++) {
            str = str + "Java";
        }
        return str;
    }

    public static String concatStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append("Java".repeat(10_000));
        return sb.toString();
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        concatString();
        System.out.println("Time required for concatenation with String " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        concatStringBuilder();
        System.out.println("Time required for concatenation with StringBuilder " + (System.currentTimeMillis() - start) + " ms");

    }
}
