import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {

    @Test
    public void testShout() {
        Fighter f = new Fighter("Warf", 10);
        assertEquals("AAAARGH!", f.shout());
    }

    @Test
    public void testDamage() {
        Fighter f = new Fighter("Warf", 10);
        for (int i=0; i<1000; i++)
        {
            int d = f.damage();
            assertTrue(d >= 5);
            assertTrue(d <= 17);
        }
    }
}