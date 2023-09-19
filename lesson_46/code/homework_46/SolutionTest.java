package homework_46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Test method with correct array of brackets 1")
    public void test_areBracketsCorrect_withCorrectExample1() {
        char[] bracketsArray = {'{', '}', '(', '[', ']', ')'};
        assertTrue(Solution.areBracketsCorrect(bracketsArray));
    }

    @Test
    @DisplayName("Test method with correct array of brackets 2")
    public void test_areBracketsCorrect_withCorrectExample2() {
        char[] bracketsArray = {'{', '}', '(', '[', ']', '{', '(', ')', '}', ')'};
        assertTrue(Solution.areBracketsCorrect(bracketsArray));
    }

    @Test
    @DisplayName("Test method with not correct array of brackets 1")
    public void test_areBracketsCorrect_withNotCorrectExample1() {
        char[] bracketsArray = {'{', '(', ']'};
        assertFalse(Solution.areBracketsCorrect(bracketsArray));
    }

    @Test
    @DisplayName("Test method with not correct array of brackets 2")
    public void test_areBracketsCorrect_withNotCorrectExample2() {
        char[] bracketsArray = {'{', '}', '(', '[', ']', ')', '}'};
        assertFalse(Solution.areBracketsCorrect(bracketsArray));
    }

    @Test
    @DisplayName("Test method with not correct array of brackets 3")
    public void test_areBracketsCorrect_withNotCorrectExample3() {
        char[] bracketsArray = {'{', '(', '}', ')'};
        assertFalse(Solution.areBracketsCorrect(bracketsArray));
    }
}