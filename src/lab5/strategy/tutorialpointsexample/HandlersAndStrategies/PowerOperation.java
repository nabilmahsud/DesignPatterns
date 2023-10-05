package lab5.strategy.tutorialpointsexample.HandlersAndStrategies;

public class PowerOperation extends OperationHandler {
    @Override
    public boolean doOperation(int a, int b) {
        int[] range = {50001, 200000};

        if (!isWithinRange(a, b, range)) return false;

        System.out.println("Power: " + (Math.pow(a, b)));
        return true;
    }
}
