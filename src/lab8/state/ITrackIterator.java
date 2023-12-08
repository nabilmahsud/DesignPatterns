package lab8.state;

public interface ITrackIterator {
    String startPlayback();
    String nextTrack();
    String previousTrack();
    void setCurrentTrackAfterStop();
}
