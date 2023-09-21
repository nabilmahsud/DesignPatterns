package observer.refactorguruexample;

import observer.refactorguruexample.publishers.EventManager;

public class Phone {
    public EventManager event;

    public Phone() {
        this.event = new EventManager("sendsms");
    }

    public void sendSMS(String message) {
        event.notify("sendsms", message);
    }
}
