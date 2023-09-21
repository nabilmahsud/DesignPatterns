package observer.tutorialpointexample;

public abstract class Observer {
    private boolean isActive = true;

    public boolean getActivityStatus() {
        return isActive;
    }

    public void setActiveStatus(boolean status) {
        isActive = status;
    }

    protected Subject subject;
    public abstract void update();
}