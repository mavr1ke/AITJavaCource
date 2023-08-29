package homework_31;

public class Practice {

    public static int countOfMatchesV1(String string, String pattern) {
        if (string == null || pattern == null || pattern.length() > string.length()) {
            return -1;
        }

        int count = 0;
        int index = string.indexOf(pattern);

        while (index != -1) {
            count++;
            index = string.indexOf(pattern, index + pattern.length());
        }

        return count;
    }

    public static int countOfMatchesV2(String string, String pattern) {
        if (string == null || pattern == null || pattern.length() > string.length()) {
            return -1;
        }

        char[] stringChars = string.toCharArray();
        char[] patternChars = pattern.toCharArray();

        int count = 0;

        for (int i = 0; i <= stringChars.length - patternChars.length; i++) {
            boolean match = true;
            for (int j = 0; j < patternChars.length; j++) {
                if (stringChars[i + j] != patternChars[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println("\n********\n");
        String string = "Hellorld World";
        String pattern = "rld";

        System.out.println("Amount of patterns in string v1: " + countOfMatchesV1(string, pattern));
        System.out.println("Amount of patterns in string v2: " + countOfMatchesV2(string, pattern));
    }
}
