package lab5.strategy.tutorialpointsexample.Context;

import lab5.strategy.tutorialpointsexample.HandlersAndStrategies.Strategy;

public class Calculator {
    private Strategy operationHandler;

    public Calculator(Strategy operationHandler) {
        this.operationHandler = operationHandler;
    }

    public void operate(int a, int b) {
        operationHandler.operate(a, b);
    }
}
