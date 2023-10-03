package dz.learnjava.genericsCourse;

//public class GenericList<E extends Number> { // Constraint on E (extending Number class)
public class GenericList<E extends Comparable<E> & Cloneable> { // extending Comparable Interface

    // Like methods, Classes have type parameter that we can call it:
    // T is short of a Type or a Template
    // E is short of an Element
    private E[] items = (E[]) new Object[10];
    private int count;

    public void add(E item) {
        items[count++] = item;
    }

    public E get(int index) {
        return items[index];
    }
}
