package lab6.iterator.tutorialpointexample;

public interface Iterator {
    public int getIndex();
    public boolean hasNext();
    public void next();
    void previous();
    public Student current();
    boolean hasPrevious();
    void moveFirst();
    void moveLast();
}