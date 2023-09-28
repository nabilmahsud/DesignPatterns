package lab4.chainofresponsibility.tutorialpointexample.Loggers;

public class DatabaseLogger extends AbstractLogger {

    public DatabaseLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Database Console::Logger: " + message);
    }
}
