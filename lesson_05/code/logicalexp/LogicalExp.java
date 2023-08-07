package logicalexp;

public class LogicalExp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean boll = true;
        boolean boll1 = false;
        boolean b1 = (a == b);

        System.out.println(b1);
        System.out.println(a == b);

        boolean b2 = a != b;
        System.out.println(b2);
        System.out.println(b != 10);

        boolean b3 = a > b;
        boolean b4 = a < b;
        boolean b5 = b > 10;
        System.out.println("b3 = " + b3 + " b4 = " + b4 + " b5 = " + b5);

        boolean b6 = a >= b;
        boolean b7 = a <= b;
        boolean b8 = b >= 10;
        System.out.println("b6 = " + b6 + " b7 = " + b7 + " b8 = " + b8);

        boolean bol = !(2 > 5);
        System.out.println(bol);

        boolean var = true & false;
        System.out.println();
        System.out.println(var);
        var = (2 < 5) & (10 != 11);
        System.out.println(var);

        boolean var1 = false | false;
        System.out.println();
        System.out.println(var1);
        var1 = (2 < 5) | (10 == 11);
        System.out.println(var1);

        boolean var2 = true ^ false;
        System.out.println();
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);

        boolean var3 = true && false;
        System.out.println();
        System.out.println(var3);
        var3 = (2 < 5) && (10 != 11);
        System.out.println(var3);

        boolean var4 = false || false;
        System.out.println();
        System.out.println(var4);
        var4 = (2 < 5) || (10 == 11);
        System.out.println(var4);


        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);

        System.out.println(true ^ true && false);
        System.out.println(false ^ false);
        System.out.println(false);

        System.out.println();
        boolean aa = true;
        boolean bb = false;
        int c = 25;
        int qq = 2;
        System.out.println();
        System.out.println((aa | bb) | (c < 100) & !(true) ^ (qq == 5));
        System.out.println((aa | bb) | (c < 100) & false ^ (qq == 5));
        System.out.println((aa | bb) | false ^ (qq == 5));
        System.out.println((aa | bb) | false);
        System.out.println(true | false);
        System.out.println();
        System.out.println(true || false ^ true & !true);
        System.out.println(true || false ^ true & false);
        System.out.println(true || false ^ false);
        System.out.println(true || false);
        System.out.println(true || false);
    }
}
