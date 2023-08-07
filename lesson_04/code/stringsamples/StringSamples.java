package stringsamples;

public class StringSamples {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(str);

        String str1 = new String("Java2");
        System.out.println(str1 );

        String str2 = new String();
        System.out.println(str2);

        String str3 = "";
        System.out.println(str3);

        String str4 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        System.out.println(str4);

        String str5 = "Hello, World!";
        int length = str5.length();
        System.out.println(length);

        str4 = str4.toUpperCase();
        System.out.println(str4);
        str4 = str4.toLowerCase();
        System.out.println(str4);

        String str6 = str5.concat(str1);
        System.out.println(str6);

        str6 = str1 + " " + str1;
        System.out.println(str6);

        str6 = String.join(" ","Sample" ,str5, str, str4);
        System.out.println("Join: "+ str6);
        String str7 = "Hello " + 213;
        System.out.println(1+2);

        String str8 = String.valueOf(8);

        String strNumbers = "01234567";
        System.out.println("length: " +strNumbers.length() );
        char firstChar = strNumbers.charAt(0);
        System.out.println(firstChar);
        char lastChar = strNumbers.charAt(strNumbers.length() - 1);
        System.out.println(lastChar);

        String substring = strNumbers.substring(2);
        System.out.println("strNumbers: " + substring);
        substring = strNumbers.substring(2, 6);
        System.out.println("strNumbers: " + substring);

        System.out.println(str2.isEmpty());

        System.out.println(strNumbers.replace("123", "hello"));

        String strTrim = " Java is great! ";
        System.out.println(strTrim.trim());

    }
}
