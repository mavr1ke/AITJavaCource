package string_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableString implements Iterable<Character>, Iterator<Character> {

    private String string;
    private int count = 0;

    public IterableString(String string) {
        this.string = string;
    }

    public boolean hasNext() {
        if (count < string.length()) {
            return true;
        }
        return false;
    }

    public Character next() {
        if (count == string.length()) {
            throw new NoSuchElementException();
        }
        count++;
        return string.charAt(count - 1);
    }

    public Iterator<Character> iterator() {
        return this;
    }
}
