package lab5.strategy.tutorialpointsexample.HandlersAndStrategies;

public class DivisionOperation extends OperationHandler {
    @Override
    public boolean doOperation(int a, int b) {
        int[] range = {5001, 10000};

        if (!isWithinRange(a, b, range)) return false;

        System.out.println("Division: " + (a / b));
        return true;
    }
}
