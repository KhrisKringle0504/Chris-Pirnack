import static org.junit.Assert.*;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyArrayListTest {
    private Random rando;

    public MyArrayListTest()
    {
        rando = new Random();
    }


    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    private void maxSizeOK(MyArrayList list)
    {
        assert(list.max_size() <= 4* list.size() || list.size() == 0);
    }

    @Test
    public void testGeneralAdd()
    {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 10; i++)
        {
            list.add(0);
            maxSizeOK(list);
        }
        assertEquals(10, list.size());
        for (int i=0; i<10; i++)
        {
            Integer val = rando.nextInt(100);
            list.add(i, val);
            assertEquals(val, list.get(i));
            assertEquals(Integer.valueOf(0), list.get(i+1));
            maxSizeOK(list);
        }
    }

    /**
     * Test of indexOf method, of class MyArrayList.
     */
    @Test
    public void testIndexOf()
    {
        MyArrayList list = new MyArrayList();
        for (int i=0; i<100; i++)
            list.add(i);
        for (int i=0; i<100; i++)
            assertEquals(i, list.indexOf(i));
        assertEquals(-1, list.indexOf(-20));
    }


    /**
     * Test of remove method, of class MyArrayList.
     */
    @Test
    public void testRemove()
    {
        MyArrayList list = new MyArrayList();
        for (int i=0; i<10; i++)
            list.add(i);
        for (int i=0; i<10; i++)
        {
            assertEquals(10-i, list.size());
            list.remove(0);
            assertEquals(-1, list.indexOf(i));
            maxSizeOK(list);
        }
    }

    @Test
    public void testGet()
    {
        MyArrayList list = new MyArrayList();
        for (int i=0; i<10; i++)
        {
            list.add(i);
            assertEquals(Integer.valueOf(i), list.get(i));
        }
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testBadGet()
    {
        MyArrayList list = new MyArrayList();
        list.get(0);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testBadAdd()
    {
        MyArrayList list = new MyArrayList();
        list.add(1,1);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testBadRemove()
    {
        MyArrayList list = new MyArrayList();
        list.remove(0);
    }

}