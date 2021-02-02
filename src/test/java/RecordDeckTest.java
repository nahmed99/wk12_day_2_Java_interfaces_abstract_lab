import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    private RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Panasonic", "Records", 45);
    }

    @Test
    public void canGetMake() {
        assertEquals("Panasonic", recordDeck.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Records", recordDeck.getModel());
    }

    @Test
    public void canGetPlaySpeed() {
        assertEquals(45, recordDeck.getPlaySpeed());
    }

    @Test
    public void canPlayRecords() {
        assertEquals("RecordDeck now playing.", recordDeck.play());
    }
}
