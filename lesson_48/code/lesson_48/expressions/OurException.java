package lesson_48.expressions;

public class OurException extends Exception {

    String string;

    public OurException(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Our exception: " + string;
    }
}
