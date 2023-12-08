package lab8.state;


/**
 * They can also trigger state transitions in the context.
 */
public class ReadyState extends State {
    public ReadyState(Player player, TrackDelay trackDelay) {
        super(player, trackDelay);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player, trackDelay));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player, trackDelay));
        return action;
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