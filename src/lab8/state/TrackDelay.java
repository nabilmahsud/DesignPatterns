package lab8.state;

import java.util.Timer;
import java.util.TimerTask;

public class TrackDelay {
    Timer timer;
    private boolean timerOn;

    TrackDelay() {
        timer = new Timer();
    }

    public void scheduleCrash() {
        timer.schedule(new TrackDelayTask(), 3000);
        timerOn = true;
    }

    public void stopScheduledCrash() {
        if (timerOn) timer.cancel();
    }


    class TrackDelayTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Crashed!");
        }
    }
}
