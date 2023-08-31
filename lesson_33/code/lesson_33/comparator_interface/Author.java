package lesson_33.comparator_interface;

public class Author implements Comparable<Author> {

    String authorName;
    String bookName;
    int year;

    public Author(String authorName, String bookName, int year) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.year = year;
    }

    @Override
    public int compareTo(Author author) {
        return this.authorName.compareTo(author.authorName);
    }

    @Override
    public String toString() {
        return authorName + " " + bookName + " " + year;
    }
}
