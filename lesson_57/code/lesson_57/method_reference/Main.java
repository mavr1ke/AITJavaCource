package lesson_57.method_reference;

public class Main {
    public static void main(String[] args) {
        boolean res = numTest(OurPredicateClass::isNegative, -1);
        if (res) {
            System.out.println("-1 is negative");
        }
        res = numTest(OurPredicateClass::isEven, 4);
        if (res) {
            System.out.println("4 is even");
        }
        res = numTest(OurPredicateClass::isPositive, 1);
        if (res) {
            System.out.println("1 is positive");
        }

        OurIntegerNumber ourIntegerNumber = new OurIntegerNumber(9);
        OurIntegerNumber ourIntegerNumber1 = new OurIntegerNumber(10);

        IntPredicate intPredicate = ourIntegerNumber::isFactor;
        res = intPredicate.test(3);
        System.out.println(res);

        intPredicate = ourIntegerNumber1::isFactor;
        res = intPredicate.test(3);
        System.out.println(res);

        IntPredicate2  intPredicate2 = OurIntegerNumber::isFactor;
        res = intPredicate2.test(ourIntegerNumber,3);
        System.out.println(res);
        res = intPredicate2.test(ourIntegerNumber1,3);
        System.out.println(res);

        SomeGenericInterface<Integer> someRef = SomeGenericClass::genMethod;
        someRef.test(1,2);

        OurInterfaceForConstructor forConstructor = OurClassForConstructor::new;
        OurClassForConstructor objectClass = forConstructor.method("Java");
        System.out.println("String  in the new object is" + objectClass.str);
    }

    public static boolean numTest(IntPredicate p, int n) {
        return p.test(n);
    }
}
