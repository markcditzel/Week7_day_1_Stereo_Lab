import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

   @Before
    public void before(){
       radio = new Radio();
   }

   @Test
   public void playRadio(){
//       radio.play("Capital", 50);
       assertEquals("Playing Capital at 50 decibels!", radio.play("Capital", 50));
   }

   @Test
    public void tuneRadio(){
//       radio.tune(104.5);
       assertEquals("104.5 FM", radio.tune(104.5));
   }

   @Test
    public void getMake(){
       radio.setMake("Sony");
       assertEquals("Sony", radio.getMake());
   }

    @Test
    public void getModel(){
        radio.setModel(2000);
        assertEquals(2000, radio.getModel());
    }


}
