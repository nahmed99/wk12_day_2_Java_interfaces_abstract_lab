import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    @Test
    public void canTuneRadio() {
        Radio radio1 = new Radio();
        assertEquals("Radio 1", radio1.tune());
    }

}
