package stringequals;

public class StringEquals {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a == b);

        String str = "Java 9";
        String str1 = "Java 9";
        String str2 = new String("JAva 9");

        System.out.println(str == str1);
        System.out.println(str == str1);

        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str2));
    }
}
