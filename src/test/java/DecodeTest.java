import ke.co.safaricom.Decode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTest {
    @Test
    public void newDecoding_instantiateCreation() {
        Decode testDecoding = new Decode(" ",' ');
        assertEquals(true, testDecoding instanceof Decode);
    }
    @Test
    public void checkKeySaved(){
        Decode testDecoding = new Decode("Dutch", '2');
        assertEquals(2, testDecoding.getKey());
    }

    @Test
    public void checkInputSaved() {
        Decode testDecoding = new Decode("Dutch",'2');
        assertEquals("Dutch", testDecoding.getInputText());
    }

    @Test
    public void validDecoding() {
        Decode testDecoding = new Decode(" ", ' ' );
        assertEquals(" ", testDecoding.decrypt(" ", ' '));
    }

}
