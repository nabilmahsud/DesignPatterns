package lab7.state;


/**
 * Concrete states provide the special implementation for all interface methods.
 */
public class LockedState extends State {

    LockedState(Player player, TrackDelay trackDelay) {
        super(player, trackDelay);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player, trackDelay));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player, trackDelay));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}