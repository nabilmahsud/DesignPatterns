package lab5.strategy.tutorialpointsexample.HandlersAndStrategies;

public class SubstractOperation extends OperationHandler {
    @Override
    public boolean doOperation(int a, int b) {
        int[] range = {101, 1000};

        if (!isWithinRange(a, b, range)) return false;

        System.out.println("Substraction: " + (a - b));
        return true;
    }
}
