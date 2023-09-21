package lab3.observer.refactorguruexample.listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener <File> {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File content) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + content.getName());
    }
}