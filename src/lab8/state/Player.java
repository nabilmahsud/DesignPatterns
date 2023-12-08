package lab8.state;

public class Player {
    private State state;
    private boolean playing = false;
    ITrackIterator iterator;
    TrackDelay trackDelay;

    public Player(TrackDelay trackDelay) {
        this.trackDelay = trackDelay;
        this.state = new ReadyState(this, trackDelay);
        iterator = new TrackIterator(trackDelay);
        setPlaying(true);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return iterator.startPlayback();
    }

    public String nextTrack() {
      return iterator.nextTrack();
    }

    public String previousTrack() {
       return iterator.previousTrack();
    }

    public TrackDelay getInstanceOfTrackDelay() {
        return trackDelay;
    }

    public void setCurrentTrackAfterStop() {
        iterator.setCurrentTrackAfterStop();
    }
}