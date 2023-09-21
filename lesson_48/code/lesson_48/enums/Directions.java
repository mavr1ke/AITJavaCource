package lesson_48.enums;

public enum Directions {
    WEST("W"),
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    ;

    private final String letter;

    Directions(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return this.letter;
    }
}
