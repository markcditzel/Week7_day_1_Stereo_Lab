import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecordDeck {

    RecordDeck recorddeck;

    @Before
    public void before(){
        recorddeck = new RecordDeck();
    }

    @Test
    public void playRecord(){
//        recorddeck.play("Purple Rain");
        assertEquals("I am playing Purple Rain", recorddeck.play("Purple Rain"));
    }

}
