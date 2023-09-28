package lab4.factory.tutorialpointexample_better_implementation;

public class CircleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
