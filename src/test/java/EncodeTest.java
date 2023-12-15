import ke.co.safaricom.Encode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeTest {
    @Test
    public void newEncoding_instantiateCreation() {
        Encode testEncoding = new Encode("Dutch",'2');
        assertEquals(true, testEncoding instanceof Encode);
    }

    @Test
    public void checkKeySaved(){
        Encode testEncoding = new Encode("Dutch", '2');
        assertEquals(2, testEncoding.getKey());
    }

    @Test
    public void checkInputSaved() {
        Encode testEncoding = new Encode("Dutch",'2');
        assertEquals("Dutch", testEncoding.getInputText());
    }

    @Test
    public void validEncoding() {
        Encode testEncoding = new Encode(" ", ' ' );
        assertEquals(" ", testEncoding.encrypt(" ", ' '));
    }


}
