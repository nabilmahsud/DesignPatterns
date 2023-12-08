package lab7.state;


/**
 * Common interface for all states.
 */
public abstract class State {
    Player player;
    TrackDelay trackDelay;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Player player, TrackDelay trackDelay) {
        this.player = player;
        this.trackDelay = trackDelay;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}