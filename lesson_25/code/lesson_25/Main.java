package lesson_25;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String str3 = "Hello";
        String str4 = "Hell";
        String str1 = new String("Hello");
        String str2 = new String();
        System.out.println(str1 == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);

        String str5 = new String();
        char[] array = {'H','e','l','l','o'};
        String strArr = new String(array);
        System.out.println(strArr);
        String strStr = new String("Hello");
        System.out.println(strStr);

        String string = "Hello Java";
        for (int i = 0; i < string.length();i++) {
            System.out.println(string.charAt(i));
        }

        System.out.println(string.equals(strStr));
        string.equalsIgnoreCase(strStr);

        System.out.println("hello".compareTo("hello"));
        System.out.println("ahello".compareTo("chello"));
        System.out.println("chello".compareTo("ahello"));
        System.out.println("chello".compareToIgnoreCase("Ahello"));

        System.out.println(string.indexOf('l'));
        System.out.println(string.indexOf('l',3));
        System.out.println(string.indexOf("lo"));
        System.out.println(string.indexOf("lo",2));


    }
}
