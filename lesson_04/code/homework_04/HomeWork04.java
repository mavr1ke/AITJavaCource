package homework_04;

public class HomeWork04 {
    public static void main(String[] args) {

        System.out.println("\n***Task 1***\n");
        String name = "Stepan";
        char firstLetter = name.charAt(0), lastLetter = name.charAt(name.length() - 1 );
        System.out.printf("My name has %d letters", name.length());
        System.out.printf("\nThe first letter of my name - %c, the last letter - %c", firstLetter, lastLetter);
        System.out.printf("\nDecimal code of the first letter - %d, the last letter - %d", (int) firstLetter, (int) lastLetter);

        System.out.println("\n\n***Task 2.1***\n");
        String str1 = "Java", str2 = "is", str3 = "a", str4 = "powerful", str5 = "language";
        String resultString = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("The first way: " + resultString);
        resultString = String.join(" ",str1, str2, str3, str4, str5);
        System.out.println("The second way with method join: " + resultString);
        resultString = str1.concat(" " + str2 + " " + str3 + " " + str4 + " " + str5);
        System.out.printf("The third way with method concat: %s\nLength of this string: %d", resultString, resultString.length());

        System.out.println("\n\n***Task 2.2***\n");
        boolean answer = resultString.contains("age");
        System.out.println("Replacement: " + resultString.replace("powerful", "super"));
        System.out.println("Does the string contain the substring \"age\"? " + "- " + answer);
        
        System.out.println("\n***Task 3***\n");
        String string1 = "string", string2 = "code", string3 = "Practice", substring;
        substring = string1.substring(((string1.length())/2) - 1, ((string1.length())/2) + 1);
        System.out.println("Two middle characters of the string \"string\": " + substring);
        substring = string2.substring(((string2.length())/2) - 1, ((string2.length())/2) + 1);
        System.out.println("Two middle characters of the string \"code\": " + substring);
        substring = string3.substring(((string3.length())/2) - 1, ((string3.length())/2) + 1);
        System.out.println("Two middle characters of the string \"Practice\": " + substring);
    }
}
