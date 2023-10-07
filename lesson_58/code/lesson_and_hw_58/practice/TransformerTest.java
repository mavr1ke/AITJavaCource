package lesson_and_hw_58.practice;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    Predicate<String> predicate;
    UnaryOperator<String> unaryOperator;
    String input = "aaa BBBB deF vbghR bbb";

    @Test
    public void transformString_ForStringLengthThree() {
        predicate = s -> s.length() == 3;
        unaryOperator = String::toUpperCase;
        String expected = "AAA BBBB DEF vbghR BBB";
        assertEquals(expected, Transformer.transformString(input, predicate, unaryOperator));
    }

    @Test
    public void transformString_ForStringLengthFour() {
        predicate = s -> s.length() == 4;
        unaryOperator = String::toLowerCase;
        String expected = "aaa bbbb deF vbghR bbb";
        assertEquals(expected, Transformer.transformString(input,predicate, unaryOperator));
    }

    @Test
    public void transformString_ForStringLengthFive() {
        predicate = s -> s.length() == 5;
        unaryOperator = s -> "*****";
        String expected = "aaa BBBB deF ***** bbb";
        assertEquals(expected, Transformer.transformString(input, predicate, unaryOperator));
    }

    @Test
    public void transformStringWithoutLambdas_ForStringLengthThree() {
        String actual = Transformer.transformStringWithoutLambdas(input, new Transformer.Length3StringTransform());
        String expected = "AAA BBBB DEF vbghR BBB";
        assertEquals(expected,actual);
    }

    @Test
    public void transformStringWithoutLambdas_ForStringLengthFour() {
        String actual = Transformer.transformStringWithoutLambdas(input, new Transformer.Length4StringTransform());
        String expected = "aaa bbbb deF vbghR bbb";
        assertEquals(expected,actual);
    }

    @Test
    public void transformStringWithoutLambdas_ForStringLengthFive() {
        String actual = Transformer.transformStringWithoutLambdas(input, new Transformer.Length5StringTransform());
        String expected = "aaa BBBB deF ***** bbb";
        assertEquals(expected,actual);
    }

    @Test
    public void transformStringWithInterfaces_ForStringLengthThree() {
        String actual = Transformer.transformStringWithInterfaces(input, new Transformer.Length3Condition());
        String expected = "AAA BBBB DEF vbghR BBB";
        assertEquals(expected,actual);
    }

    @Test
    public void transformStringWithInterfaces_ForStringLengthFour() {
        String actual = Transformer.transformStringWithInterfaces(input, new Transformer.Length4Condition());
        String expected = "aaa bbbb deF vbghR bbb";
        assertEquals(expected,actual);
    }

    @Test
    public void transformStringWithInterfaces_ForStringLengthFive() {
        String actual = Transformer.transformStringWithInterfaces(input, new Transformer.Length5Condition());
        String expected = "aaa BBBB deF ***** bbb";
        assertEquals(expected,actual);
    }
}