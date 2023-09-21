package lab3.decorator.tutorialpointexample;

public abstract class ShapeDecorator extends Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(int price, Shape decoratedShape){
        super(price);
        this.decoratedShape = decoratedShape;
    }

    public abstract void draw();

    public void computeCost() {
        System.out.println(decoratedShape.getPrice() + getPrice());
    }

}