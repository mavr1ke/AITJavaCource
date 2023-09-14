package lesson_43.set_implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OurHashSet<E> implements OurSet<E>{

    private final static Object INSTANCE = new Object();
    private final Map<E,Object> source;

    public OurHashSet() {
        this.source = new HashMap<>();
    }

    public int size() {
        return source.size();
    }

    public boolean add(E elt) {
        return source.put(elt,INSTANCE) == null;
    }

    public boolean remove(E elt) {
        return source.remove(elt) != null;
    }

    public boolean contains(E elt) {
        return source.containsKey(elt);
    }

    @Override
    public Iterator<E> iterator() {
        return source.keySet().iterator();
    }
}
