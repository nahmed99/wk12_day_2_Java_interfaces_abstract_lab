import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    @Test
    public void canConnectToStereo() {
        // Create Stereo instance
        Stereo stereo = new Stereo("More Soundz");

        // Create MP3Player instance
        MP3Player mp3Player = new MP3Player();

        // Test
        assertEquals("More Soundz", mp3Player.connect(stereo));
    }


}
