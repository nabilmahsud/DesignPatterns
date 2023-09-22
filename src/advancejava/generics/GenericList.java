package advancejava.generics;

public class GenericList<T> {
    private T[] list = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        list[count++] = item;
    }

    public T getAt(int index) {
        return list[index];
    }
}
