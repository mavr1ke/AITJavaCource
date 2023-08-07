package charvariable;

public class CharVariable {
    public static void main(String[] args) {

        char a = 'A';
        char b = 0x41;
        char c = 65;
        b = 0x0041;
        char d = '\u0041';
        char e = '\u2019';

        System.out.println(" a: " + a + " b: " + b + " c: " + c + " d: " + d);
        System.out.println(e);

        char ch = 'A';
        ch++;
        System.out.println(ch);

        ch = 48;
        ch += 2;
        System.out.println(ch);
    }
}
