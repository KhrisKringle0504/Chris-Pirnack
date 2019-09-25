import static org.junit.Assert.*;
import java.util.HashSet
;
public class RandoTest {

    @org.junit.Test
    public void random() {
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i=0; i<100; i++)
            nums.add(Rando.random(i));
        assertTrue(5 < nums.size());
    }
}