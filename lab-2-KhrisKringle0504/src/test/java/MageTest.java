import org.junit.Test;

import static org.junit.Assert.*;

public class MageTest {

    @Test
    public void testShout() {
        Mage m = new Mage("Albus", 100);
        assertEquals("FWOOSH", m.shout());
    }

    @Test
    public void testDamage() {
        Mage m = new Mage("Albus", 100);
        assertEquals(11, m.damage());
    }
}