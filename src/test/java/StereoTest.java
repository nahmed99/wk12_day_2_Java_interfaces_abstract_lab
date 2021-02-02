import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;

    @Before
    public void before() {
        stereo = new Stereo("So Much Sound");
    }

    @Test
    public void hasName() {
        assertEquals("So Much Sound", stereo.getName());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", stereo.tune());
    }

    @Test
    public void canGetRecordDeckPlaySpeed(){
        assertEquals(45, stereo.getRecordDeckPlaySpeed());
    }

    @Test
    public void canPlayRecordDeck(){
        assertEquals("RecordDeck now playing.", stereo.playRecordDeck());
    }

    @Test
    public void canGetNumOfCDs(){
        assertEquals(5, stereo.getNumOfCDs());
    }

    @Test
    public void canPlayCDs(){
        assertEquals("CD player is now playing.", stereo.playCD());
    }

}
