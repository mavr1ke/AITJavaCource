package mathematics;

public class IntegerNum {
    public static void main(String[] args) {
        System.out.println("\nMathematics");

        int x = 20;
        int y = 10;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int z = x + y;

        System.out.printf("\nx + y = %d\n" , z);
        z = x - y;
        System.out.printf("x - y = %d\n" , z);
        z = x * y;
        System.out.printf("x * y = %d\n\n" , z);

        x = 57;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = x / y;
        System.out.printf("\nx / y = %d\n" , z);
        z = x % y;
        System.out.println("x  %  y = " + z);

        x = 60;
        y = 12;
        z = x % y;

        System.out.println("\nx = " + x);
        System.out.println("y = " + y);
        System.out.println("\nx  %  y = " + z);

        double f = 10.0D;
        double g = 9.8;
        System.out.println("\nf = " + f);
        System.out.println("g = " + g);

        double e = f / g;
        System.out.println("\nResult " + f + " / " + g + " = " + e);
        System.out.printf("\nResult %.2f / %.2f = %.2f", f, g, e);

        // type conversion
        int  num1 = 10;
        int  num2 = 3;
        System.out.println("\n\nnum1 = " + num1);
        System.out.println("num2 = " + num2);

        double d1 = (double) num1 / (double) num2; // int to double
        System.out.println("\nnum1 / num2 = " + d1);

        int num3 = (int) d1; // double to int
        System.out.println("Convert to int = " + num3);

        // class Math

        double r = 10;
        double length = 2 * Math.PI * r; // length of a circle
        System.out.println("\nLength of circle is = " + length);

        double area = Math.PI * Math.pow(r , 2);// area of a circle
        System.out.println("\nArea of circle is = " + area);

        //increment and decrement
        int i = 0;
        System.out.println("\ni = " + i);

        i++;

        System.out.println("i++ = " + i);

        i = 0;
        ++i;

        System.out.println("++i = " + i);

        i = 0;
        i--;

        System.out.println("i-- = " + i);
    }
}
