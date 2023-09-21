package observer.refactorguruexample.listeners;

public interface EventListener <T> {
    void update(String eventType, T content);
}