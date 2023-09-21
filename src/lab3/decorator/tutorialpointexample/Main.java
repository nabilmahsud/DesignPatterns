package lab3.decorator.tutorialpointexample;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(10);

        Shape redCircle = new RedShapeDecorator(10, new Circle(20));

        redCircle.draw();
    }
}