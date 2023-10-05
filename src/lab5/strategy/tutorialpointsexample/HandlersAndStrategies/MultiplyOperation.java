package lab5.strategy.tutorialpointsexample.HandlersAndStrategies;

public class MultiplyOperation extends OperationHandler {
    @Override
    public boolean doOperation(int a, int b) {
        int[] range = {1001, 5000};

        if (!isWithinRange(a, b, range)) return false;

        System.out.println("Multiply: " + (a * b));
        return true;
    }
}
