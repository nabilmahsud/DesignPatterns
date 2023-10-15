package lab5.strategy.tutorialpointsexample.HandlersAndStrategies;

public abstract class OperationHandler implements Strategy {
    private OperationHandler next;

    public void setNextHandler(OperationHandler next) {
        this.next = next;
    }


    public void operate(int a, int b) {
        if(doOperation(a, b)) {
            return;
        } else if (next != null)
            next.operate(a, b);
    }

    public boolean isWithinRange(int a, int b, int[] range) {
        return ((a >= range[0] && a <= range[1]) && (b >= range[0] && b <= range[1]));
    }

    public abstract boolean doOperation(int a, int b);
}
