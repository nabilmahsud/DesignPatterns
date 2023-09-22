package advancejava.generics;

public class List {
    private int[] list = new int[10];
    private int count;

    public void add(int number) {
        list[count++] = number;
    }

    public int getAt(int index) {
        return list[index];
    }
}
