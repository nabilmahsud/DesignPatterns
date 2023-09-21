package lab3.observer.refactorguruexample.listeners;

public interface EventListener <T> {
    void update(String eventType, T content);
}