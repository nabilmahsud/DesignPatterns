package lab5.strategy.tutorialpointsexample;

import lab5.strategy.tutorialpointsexample.Context.Calculator;
import lab5.strategy.tutorialpointsexample.HandlersAndStrategies.AddOperation;
import lab5.strategy.tutorialpointsexample.HandlersAndStrategies.MultiplyOperation;
import lab5.strategy.tutorialpointsexample.HandlersAndStrategies.SubstractOperation;

public class Main {
    public static void main(String[] args) {
        var add = new AddOperation();
        var subtract = new SubstractOperation();
        var multiply = new MultiplyOperation();

        add.setNextHandler(subtract);
        subtract.setNextHandler(multiply);

        var calculator = new Calculator(add);
        calculator.operate(5, 5);
    }
}
