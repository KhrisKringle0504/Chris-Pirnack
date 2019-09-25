import org.junit.Test;

import static org.junit.Assert.*;

public class LengthMismatchExceptionTest {
    @Test
    public void testExceptionType()
    {
        LengthMismatchException e = new LengthMismatchException();
        RuntimeException r = new RuntimeException();
        assertTrue(r.getClass().isInstance(e));
    }

}