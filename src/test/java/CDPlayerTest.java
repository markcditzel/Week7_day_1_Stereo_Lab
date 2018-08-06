import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdplayer;

    @Before
    public void before(){
        cdplayer = new CDPlayer(5);
    }

    @Test
    public void playCD(){
//        cdplayer.play("All Saints");
        assertEquals("Playing All Saints", cdplayer.play("All Saints"));
    }

    @Test
    public void TestNumberOfCDDrawers(){
        assertEquals(5, cdplayer.getNumberOfCDDrawers());
    }


}
