package homework_30;

import java.util.Arrays;

public class Practice {

    public static String mySubstring(String string, int startIndex, int endIndex) {
        // O(n)
        if (startIndex < 0 || endIndex < 0 || startIndex >= endIndex || string == null) {
            return "error";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isAnagramsV1(String string, String string2) {
        // O(n^2)
        if (string.length() != string2.length() || string.length() == 0) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            int countInString1 = 0;
            int countInString2 = 0;

            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == currentChar) {
                    countInString1++;
                }
                if (string2.charAt(j) == currentChar) {
                    countInString2++;
                }
            }

            if (countInString1 != countInString2) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramsV2(String string, String string2) {
        // O(log n)
        if (string.length() != string2.length() || string.length() == 0) {
            return false;
        }
        char[] chArray = string.toCharArray();
        char[] chArray2 = string2.toCharArray();
        Arrays.sort(chArray);
        Arrays.sort(chArray2);
        return Arrays.equals(chArray, chArray2);
    }

    public static boolean isAnagramsV3(String string, String string2) {
        // O(n)
        if (string.length() != string2.length() || string.length() == 0) {
            return false;
        }
        char[] chArray = new char[256];
        for (int i = 0; i < string.length();i++) {
            chArray[string.charAt(i)]++;
            chArray[string2.charAt(i)]--;
        }

        for (int count: chArray) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("\n***Task 1***\n");
        String str = "Hello Java";
        System.out.println("String: " + str);
        System.out.println("str substring from 0 to 7: " + mySubstring(str, 0, 7));

        String str1 = "aba";
        String str2 = "abb";
        System.out.println("str1 and str2 is anagram v1: " + isAnagramsV1(str1, str2));
        System.out.println("str1 and str2 is anagram v2: " + isAnagramsV2(str1, str2));
        System.out.println("str1 and str2 is anagram v3: " + isAnagramsV3(str1, str2));

        //Task 2
        /*
        f(n) = 9n + 73 -> 9n | f(n) = n

        f(n) = 235 -> 1 | f(n) = 1

        f(n) = n^2 + 7n + 123 -> n^2 + 7n -> n^2 | f(n) = n^2

        f(n) = n^3 + 2000n + 8765 -> n^3 + 2000n -> n^3 | f(n) = n^3

        f(n) = n + sqrt(n) -> n | f(n) = n
        */

    }
}
