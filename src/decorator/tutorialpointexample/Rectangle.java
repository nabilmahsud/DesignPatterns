package decorator.tutorialpointexample;

public class Rectangle extends Shape {

    public Rectangle(int price) {
        super(price);
    }

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}