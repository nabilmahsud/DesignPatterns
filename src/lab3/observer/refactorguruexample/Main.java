package lab3.observer.refactorguruexample;

import lab3.observer.refactorguruexample.listeners.EmailNotificationListener;
import lab3.observer.refactorguruexample.listeners.LogOpenListener;
import lab3.observer.refactorguruexample.listeners.SMSSupportListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Phone phone = new Phone();
        phone.event.subscribe("sendsms", new SMSSupportListener("034946789"));
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            phone.sendSMS("Hey guys");
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}