package lesson_33.comparator_interface;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Author> {

    @Override
    public int compare(Author a1, Author a2) {
        return a1.bookName.compareTo(a2.bookName);
    }
}
