package lab7.state;

public class PlayingState extends State {

    PlayingState(Player player, TrackDelay trackDelay) {
        super(player, trackDelay);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player, trackDelay));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player, trackDelay));
        return "Paused...";
    }

    @Override
    public String onNext() {

        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}