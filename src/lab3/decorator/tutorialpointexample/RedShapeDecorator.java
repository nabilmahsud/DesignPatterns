package lab3.decorator.tutorialpointexample;

public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(int price, Shape decoratedShape) {
        super(price, decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
        computeCost();
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red, Price: " + getPrice());
    }
}
