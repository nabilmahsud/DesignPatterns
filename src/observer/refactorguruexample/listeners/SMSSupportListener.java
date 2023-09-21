package observer.refactorguruexample.listeners;

public class SMSSupportListener implements EventListener <String> {
    private String to;

    public SMSSupportListener(String to) {
        this.to = to;
    }

    @Override
    public void update(String eventType, String content) {
        if (content.length() > 160)
            System.out.println("Cannot send SMS, make sure the length of your SMS is less than 160 characters");
        else
            System.out.println("To: " + to + " Message: " + content + " Status: Sent");
    }
}
