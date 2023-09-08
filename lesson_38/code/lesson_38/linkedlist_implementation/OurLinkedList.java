package lesson_38.linkedlist_implementation;

import java.util.Iterator;

public class OurLinkedList<E> implements OurList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    public OurLinkedList() {

    }

    @Override
    public void append(E value) {

        Node<E> newNode;
        if (size > 0) {
            newNode = new Node<>(null, last, value);
            last.next = newNode;

        } else {
            newNode = new Node<>(null, null, value);
            first = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> needle = getNode(index);
        return needle.value;
     }

     private Node<E> getNode(int index) {
        Node<E> needle = first;
         for (int i = 0; i < index; i++) {
             needle = needle.next;
         }
         return needle;
      }

    @Override
    public void set(E o, int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> needle = getNode(index);
        needle.value = o;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        Node<E> needle = first;
        for (int i = 0; i < size; i++) {
            if (needle.value.equals(o)) {
                return true;
            }
            needle = needle.next;
        }
        return false;
    }

    @Override
    public boolean remove(E o) {
        Node<E> needle = first;
        for (int i = 0; i < size; i++) {
            if (needle.value.equals(o)) {
                removeById(i);
                return true;
            }
            needle = needle.next;
        }
        return false;
    }

    @Override
    public E removeById(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> nodeToRemove = getNode(index);
        Node<E> left = nodeToRemove.previous;
        Node<E> right = nodeToRemove.next;

        if (index > 0 && index < size - 1) {
            nodeToRemove.next = null;
            nodeToRemove.previous = null;
            
            left.next = right;
            right.previous = left;
        } else if (index == 0){
            right.previous = null;
            first = right;
        } else {
            left.next = null;
            last = left;
        }
        size--;

        return nodeToRemove.value;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++){
            System.out.print(get(i) + ((i < size - 1) ? ", " : ""));
        }
        System.out.println("]");
    }

    public Iterator<E> iterator(){
        return new OurLinkedListIterator();
    }

    private class OurLinkedListIterator implements Iterator<E> {

        Node<E> currentNode = first;

        public boolean hasNext() {
            return currentNode != null;
        }
        public E next() {
            E res = currentNode.value;
            currentNode = currentNode.next;
            return res;
        }
    }


    private static class Node<E> {
        Node<E> next;
        Node<E> previous;
        E value;

        Node() {

        }

        Node(Node<E> next, Node<E> previous, E value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

    }
}
