import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {


    private CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Samsung", "CDiscs", 5);
    }

    @Test
    public void canGetMake() {
        assertEquals("Samsung", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("CDiscs", cdPlayer.getModel());
    }

    @Test
    public void canGetPlaySpeed() {
        assertEquals(5, cdPlayer.getNumOfCDs());
    }

    @Test
    public void canPlayRecords() {
        assertEquals("CD player is now playing.", cdPlayer.play());
    }

}
