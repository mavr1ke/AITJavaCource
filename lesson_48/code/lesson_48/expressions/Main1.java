package lesson_48.expressions;

public class Main1 {
    public static void main(String[] args) {
        try {
            throw new OurException("This is our error message");
        }
        catch (OurException e) {
            System.out.println(e);
        }
    }
}
