import static org.junit.Assert.*;

public class PlayerCharacterTest {

    @org.junit.Test
    public void testPolymorphism() {
        PlayerCharacter party [] = new PlayerCharacter[4];
        party[0] = new Fighter("Keg", 13);
        party[1] = new Cleric("Dave", 10);
        party[2] = new Mage("Richard", 8);
        party[3] = new Fighter("Xena", 15);

        assertEquals("AAAARGH!", party[0].shout());
        assertEquals("AAAARGH!", party[3].shout());
        assertEquals("I heal thee!", party[1].shout());
        assertEquals("FWOOSH", party[2].shout());

        Targetable t = party[1];
        t.heal(7);

        assertEquals(10, party[1].getHP());
        t.hurt(12);
        assertEquals(0, party[1].getHP());
    }

}