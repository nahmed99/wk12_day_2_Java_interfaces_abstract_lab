public class CDPlayer extends Component implements IPlay {

    private String make;
    private String model;
    private int numOfCDs;

    public CDPlayer(String make, String model, int numOfCDs) {
        super(make, model);

        this.numOfCDs = numOfCDs;
    }


    public int getNumOfCDs() {
        return numOfCDs;
    }

    public String play() {
        return "CD player is now playing.";
    }

}
