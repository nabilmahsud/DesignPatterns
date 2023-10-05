package lab5.strategy.tutorialpointsexample.HandlersAndStrategies;

public class AddOperation extends OperationHandler {
    @Override
    public boolean doOperation(int a, int b) {
        int[] range = {0, 100};

        if (!isWithinRange(a, b, range)) return false;

        System.out.println("Addition: " + (a + b));
        return true;
    }
}
