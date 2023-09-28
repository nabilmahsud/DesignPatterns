package lab4.chainofresponsibility.refactorguruexample.middleware;

public class UsageLoggerMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        System.out.println("Login detailed logged!");
        return checkNext(email, password);
    }
}
