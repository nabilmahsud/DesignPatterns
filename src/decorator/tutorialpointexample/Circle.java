package decorator.tutorialpointexample;

public class Circle extends Shape {

    public Circle(int price) {
        super(price);
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle, Price: " +  getPrice());
    }
}