package lab4.chainofresponsibility.tutorialpointexample;

import lab4.chainofresponsibility.tutorialpointexample.Loggers.*;

public class Main {

    private static AbstractLogger getChainOfLoggers(AbstractLogger... loggers) {
        for (var i = 0; i < loggers.length; i++)
            if(i != loggers.length - 1)
                loggers[i].setNextLogger(loggers[i+1]);
        return loggers[0];
    }


    public static void main(String[] args) {
        var loggerChain = getChainOfLoggers(new ErrorLogger(AbstractLogger.ERROR),
                                                        new FileLogger(AbstractLogger.DEBUG),
                                                        new ConsoleLogger(AbstractLogger.INFO),
                                                        new DatabaseLogger(AbstractLogger.WARNING));

        var loggerChain2 = getChainOfLoggers(new ErrorLogger(AbstractLogger.ERROR),
                                                        new DatabaseLogger(AbstractLogger.WARNING),
                                                        new ConsoleLogger(AbstractLogger.INFO));


        loggerChain2.logMessage(AbstractLogger.WARNING,
                "This is an debug level information.");


    }
}
