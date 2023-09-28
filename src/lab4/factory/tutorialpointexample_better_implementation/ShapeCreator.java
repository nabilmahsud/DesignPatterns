package lab4.factory.tutorialpointexample_better_implementation;

public abstract class ShapeCreator {
    public void draw() {
        var shape = createShape();
        shape.draw();
    }

    public abstract Shape createShape();
}
