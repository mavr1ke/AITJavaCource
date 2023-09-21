package lesson_48.expressions;

public class NonIntegerException extends Exception {

    int n;
    int d;

    public NonIntegerException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "result of " + n + "/" + d + " is not integer";
    }
}
