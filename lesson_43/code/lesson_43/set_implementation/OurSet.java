package lesson_43.set_implementation;

public interface OurSet<E> extends Iterable<E>{

    boolean add(E elt);
    boolean remove(E elt);
    boolean contains(E elt);
    int size();
}
