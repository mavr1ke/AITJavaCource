package homework_03;

public class HomeWork03 {
    public static void main(String[] args) {

        System.out.println("\n***Task 1***\n");
        int v1 = 0, v2 = 1, v3 = 2, v4 = 3, v5 = 4, v6 = 5, v7 = 6, v8 = 7, v9 = 8, v10 = 9, average, summ;
        double remainder;
        summ = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10;
        average = summ/10;
        remainder = (summ % 10);
        System.out.printf("Arithmetical mean of 0-9: " + average);
        System.out.println("\nNumber after the decimal point " + remainder/ 10);

        System.out.println("\n***Task 2***\n");
        int productCost1 = 1000, productCost2 = 500, discountPercent = 10;
        double amount, discount, discountedAmount;
        amount = productCost1 + productCost2;
        System.out.println("Amount: " + amount);
        discount = amount * discountPercent/ 100;
        System.out.println("Discount from the amount(10%): " + discount);
        discountedAmount = amount - discount;
        System.out.println("Discounted amount: " + discountedAmount);

        System.out.println("\n***Task 3***\n");
        int monday = 25, tuesday = 24, wednesday = 24, thursday = 22, friday = 23, saturday = 22, sunday = 25;
        double averageTemp = (double)(monday + tuesday + wednesday + thursday + friday + saturday + sunday)/7;
        System.out.printf("M0 - %d TU - %d WE - %d TH - %d FR - %d SA - %d SU - %d" , monday, tuesday, wednesday, thursday, friday, saturday, sunday);
        System.out.printf("\nAverage temperature in Munich last week: %.1f °C" , averageTemp );

        System.out.println("\n\n***Task 4***\n");
        int count = 10, remainder1, remainder2;

        for (int i = 0; i <= count; i++) {
            remainder1 = i % 2;
            remainder2 = i % 3;
            System.out.println("Remainder from " + i + "/2: " + remainder1);
            System.out.println("Remainder from " + i + "/3: " + remainder2);
        }
        System.out.println("\nRemainders from division by 2 is 0-1, by 3 is 0-2");

        System.out.println("\n***Task 5***\n");
        int x = 3;
        // variable x cant be increased with ++ in this expression, I guess x=3
        x += x++;
        System.out.println("x += x++ is " + x); // ouch
    }
}
