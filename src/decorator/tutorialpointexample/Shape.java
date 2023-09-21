package decorator.tutorialpointexample;

public abstract class Shape {
    private int price;

    protected Shape(int price) {
        this.price = price;
    }

    public abstract void draw();

    public int getPrice() {
        return price;
    }
}