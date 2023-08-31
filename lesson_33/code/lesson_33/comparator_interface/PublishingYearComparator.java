package lesson_33.comparator_interface;

import java.util.Comparator;

public class PublishingYearComparator implements Comparator<Author> {
    @Override
    public int compare(Author a1, Author a2) {
        return Integer.compare(a1.year, a2.year);
    }
}
