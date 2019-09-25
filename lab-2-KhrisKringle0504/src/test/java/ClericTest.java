import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    @Test
    public void testShout() {
        Cleric c = new Cleric("Alice", 10);
        assertEquals("I heal thee!", c.shout());
    }

    @Test
    public void testDamage() {
        Cleric c = new Cleric("Alice", 10);
        assertEquals(0, c.damage());
    }
}