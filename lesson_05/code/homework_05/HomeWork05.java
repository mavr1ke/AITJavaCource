package homework_05;

import java.util.Random;

public class HomeWork05 {
    public static void main(String[] args) {

        System.out.println("\n***Task 1***\n");
        Random random = new Random();
        int var1 = random.nextInt(20);
        int var2 = random.nextInt(20);
        int var3 = random.nextInt(20);
        int var4 = random.nextInt(20);
        int var5 = random.nextInt(20);
        int var6 = random.nextInt(20);
        int var7 = random.nextInt(20);
        int var8 = random.nextInt(20);
        int var9 = random.nextInt(20);
        int var10 = random.nextInt(20);

        System.out.println("Число: " + var1 + " четное: " + ((var1 != 0) & (var1 % 2 == 0)) + ", кратно 3: " + ((var1 != 0) & (var1 % 3 == 0)) + ", четное и кратное 3: " + ((var1 % 2 == 0) && (var1 % 3 == 0)));
        System.out.println("Число: " + var2 + " четное: " + ((var2 != 0) & (var2 % 2 == 0)) + ", кратно 3: " + ((var2 != 0) & (var2 % 3 == 0)) + ", четное и кратное 3: " + ((var2 % 2 == 0) && (var2 % 3 == 0)));
        System.out.println("Число: " + var3 + " четное: " + ((var3 != 0) & (var3 % 2 == 0)) + ", кратно 3: " + ((var3 != 0) & (var3 % 3 == 0)) + ", четное и кратное 3: " + ((var3 % 2 == 0) && (var3 % 3 == 0)));
        System.out.println("Число: " + var4 + " четное: " + ((var4 != 0) & (var4 % 2 == 0)) + ", кратно 3: " + ((var4 != 0) & (var4 % 3 == 0)) + ", четное и кратное 3: " + ((var4 % 2 == 0) && (var4 % 3 == 0)));
        System.out.println("Число: " + var5 + " четное: " + ((var5 != 0) & (var5 % 2 == 0)) + ", кратно 3: " + ((var5 != 0) & (var5 % 3 == 0)) + ", четное и кратное 3: " + ((var5 % 2 == 0) && (var5 % 3 == 0)));
        System.out.println("Число: " + var6 + " четное: " + ((var6 != 0) & (var6 % 2 == 0)) + ", кратно 3: " + ((var6 != 0) & (var6 % 3 == 0)) + ", четное и кратное 3: " + ((var6 % 2 == 0) && (var6 % 3 == 0)));
        System.out.println("Число: " + var7 + " четное: " + ((var7 != 0) & (var7 % 2 == 0)) + ", кратно 3: " + ((var7 != 0) & (var7 % 3 == 0)) + ", четное и кратное 3: " + ((var7 % 2 == 0) && (var7 % 3 == 0)));
        System.out.println("Число: " + var8 + " четное: " + ((var8 != 0) & (var8 % 2 == 0)) + ", кратно 3: " + ((var8 != 0) & (var8 % 3 == 0)) + ", четное и кратное 3: " + ((var8 % 2 == 0) && (var8 % 3 == 0)));
        System.out.println("Число: " + var9 + " четное: " + ((var9 != 0) & (var9 % 2 == 0)) + ", кратно 3: " + ((var9 != 0) & (var9 % 3 == 0)) + ", четное и кратное 3: " + ((var9 % 2 == 0) && (var9 % 3 == 0)));
        System.out.println("Число: " + var10 + " четное: " + ((var10 != 0) & (var10 % 2 == 0)) + ", кратно 3: " + ((var10 != 0) & (var10 % 3 == 0)) + ", четное и кратное 3: " + ((var10 % 2 == 0) && (var10 % 3 == 0)));

        System.out.println("\n***Task 2***\n");
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (45 < 70) & false ^ (6 == 5));
        System.out.println((true | false) | false ^ (6 == 5));
        System.out.println((true | false) | false);
        System.out.println(true | false);
        System.out.println(true);
    }
}
