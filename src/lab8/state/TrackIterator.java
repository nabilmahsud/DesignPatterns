package lab8.state;

import java.util.ArrayList;
import java.util.List;

public class TrackIterator implements ITrackIterator {
    private List<String> playlist = new ArrayList<>();
    String track5;
    private int currentTrack = 0;
    TrackDelay trackDelay;

    TrackIterator(TrackDelay trackDelay) {
        this.trackDelay = trackDelay;
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
        track5 = playlist.get(4);
    }

    @Override
    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    @Override
    public String nextTrack() {
        currentTrack++;
        if (playlist.get(currentTrack) == track5) {
            trackDelay.scheduleCrash();
        } else
            trackDelay.stopScheduledCrash();
        return "Playing " + playlist.get(currentTrack);
    }

    @Override
    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    @Override
    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
