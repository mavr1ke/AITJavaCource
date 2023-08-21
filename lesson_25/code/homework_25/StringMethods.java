package homework_25;

public class StringMethods {
    public static boolean strEndsWithAnotherStr(String str1, String str2) {
        // " ".endsWith(" ");
        if (str1 == null || str2 == null || str1.length() < str2.length()) {
            return false;
        }
        int startIndex = str1.length() - str2.length();
        int valueCounter = 0;
        for (int i = startIndex, j = 0; i < str1.length(); i++, j++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                valueCounter++;
            } else return false;
        }
        return valueCounter == str2.length();
    }

    public static char[] createsCharArray(String str) {
        // toCharArray()
        if (str == null) {
            return new char[0];
        }
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static String removeDuplicateChars(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length();i++) {
            char currentChar = string.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
               result.append(currentChar);
            }
        }
        return result.toString();
    }
}
