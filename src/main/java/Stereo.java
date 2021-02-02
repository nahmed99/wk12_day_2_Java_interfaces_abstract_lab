public class Stereo {

    private String name;

    private Radio radio;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;

    public Stereo(String name) {
        this.name = name;

        radio = new Radio();
        recordDeck = new RecordDeck("Sharp", "R-Player", 45);
        cdPlayer = new CDPlayer("Lenovo", "ComDiscs", 5);
    }


    public String getName(){
        return name;
    }

    public String tune() {
        return radio.tune();
    }

    public int getRecordDeckPlaySpeed(){
        return recordDeck.getPlaySpeed();
    }

    public int getNumOfCDs(){
        return cdPlayer.getNumOfCDs();
    }

    public String playRecordDeck(){
        return recordDeck.play();
    }

    public String playCD(){
        return cdPlayer.play();
    }



}
