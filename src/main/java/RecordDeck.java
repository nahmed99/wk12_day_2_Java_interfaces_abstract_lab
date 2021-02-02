public class RecordDeck extends Component implements IPlay {

    private String make;
    private String model;
    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed) {
        super(make, model);

        this.playSpeed = playSpeed;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public String play() {
        return "RecordDeck now playing.";
    }

}
