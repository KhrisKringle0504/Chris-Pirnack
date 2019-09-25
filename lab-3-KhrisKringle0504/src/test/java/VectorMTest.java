import org.junit.Test;

import static org.junit.Assert.*;

public class VectorMTest {

    @Test
    public void testDotL3() {
        VectorM v1 = new VectorM(3);
        VectorM v2 = new VectorM(3);
        for (int i=0; i<3; i++)
        {
            v1.set(i, i);
            v2.set(i, 2*i);
        }
        int result = v1.dot(v2);
        assertEquals(10, result);
    }

    @Test
    public void testDotL4() {
        VectorM v1 = new VectorM(4);
        VectorM v2 = new VectorM(4);
        for (int i=0; i<4; i++)
        {
            v1.set(i, i);
            v2.set(i, 2*i);
        }
        int result = v1.dot(v2);
        assertEquals(28, result);
    }

    @Test
    public void testAddL3() {
        VectorM v1 = new VectorM(3);
        VectorM v2 = new VectorM(3);
        for (int i=0; i<3; i++)
        {
            v1.set(i, i);
            v2.set(i, 2*i);
        }
        VectorM result = v1.add(v2);
        assertEquals(0, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(6, result.get(2));

    }

    @Test
    public void testAddL4() {
        VectorM v1 = new VectorM(4);
        VectorM v2 = new VectorM(4);
        for (int i=0; i<4; i++)
        {
            v1.set(i, i);
            v2.set(i, 2*i);
        }
        VectorM result = v1.add(v2);
        assertEquals(0, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(9, result.get(3));
    }

    @Test (expected = LengthMismatchException.class)
    public void testBadSizeDot()
    {
        boolean good=false;
        VectorM v1 = new VectorM(3);
        VectorM v2 = new VectorM(2);
        v1.dot(v2);
    }

    @Test (expected = LengthMismatchException.class)
    public void testBadSizeAdd()
    {
        boolean good=false;
        VectorM v1 = new VectorM(3);
        VectorM v2 = new VectorM(2);
        v1.add(v2);
    }
}