package lab7.state;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackIterator implements ITrackIterator {
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    TrackIterator() {
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }

    @Override
    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    @Override
    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
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
