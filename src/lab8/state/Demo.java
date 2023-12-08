package lab8.state;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        TrackDelay trackDelay = new TrackDelay();
        Player player = new Player(trackDelay);
        UI ui = new UI(player);
        ui.init();
    }
}