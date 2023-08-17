package homework_23;

public class Cage {
    private short length;
    private short width;

    public Cage(short length, short width) {
        this.length = length;
        this.width = width;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public String toString() {
        return "\nCage length: " + length + "\nCage width: " + width;
    }
}
