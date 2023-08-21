package homework_25;

import java.util.Arrays;

public class HWMain {
    public static void main(String[] args) {

        System.out.println("\n***Task 1***\n");
        String str1 = "Hello Java";
        String str2 = "Java";
        System.out.println("str1: " + str1 + "\nstr2: " + str2);
        System.out.println("str1 ends with str2 = " + StringMethods.strEndsWithAnotherStr(str1, str2));

        System.out.println("\n***Task 2***\n");
        char[] chars = StringMethods.createsCharArray(str1);
        System.out.println("char array from str1:\n" + Arrays.toString(chars));

        System.out.println("\n***Task 3***\n");
        System.out.println("remove duplicates from str1:\n" + StringMethods.removeDuplicateChars(str1));
    }
}
