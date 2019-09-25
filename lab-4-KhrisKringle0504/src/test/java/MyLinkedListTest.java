import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author squishy
 */
public class MyLinkedListTest {

    private Random rando;

    public MyLinkedListTest()
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

    private void maxSizeOK(MyLinkedList list)
    {
        //assert(list.max_size() <= 4* list.size() || list.size() == 0);
    }

    @Test
    public void testGeneralAdd()
    {
        MyLinkedList list = new MyLinkedList();
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
     * Test of indexOf method, of class MyLinkedList.
     */
    @Test
    public void testIndexOf()
    {
        MyLinkedList list = new MyLinkedList();
        for (int i=0; i<100; i++)
            list.add(i);
        for (int i=0; i<100; i++)
            assertEquals(i, list.indexOf(i));
    }


    /**
     * Test of remove method, of class MyLinkedList.
     */
    @Test
    public void testRemove()
    {
        MyLinkedList list = new MyLinkedList();
        for (int i=0; i<10; i++)
            list.add(i);
        for (int i=0; i<9; i++)
        {
            assertEquals(10-i, list.size());
            list.remove(1);
            assertEquals(-1, list.indexOf(i+1));
            maxSizeOK(list);
        }
    }

    @Test
    public void testGet()
    {
        MyLinkedList list = new MyLinkedList();
        for (int i=0; i<10; i++)
        {
            list.add(i);
            assertEquals(Integer.valueOf(i), list.get(i));
        }
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testBadGet()
    {
        MyLinkedList list = new MyLinkedList();
        list.get(0);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testBadAdd()
    {
        MyLinkedList list = new MyLinkedList();
        list.add(1,1);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testBadRemove()
    {
        MyLinkedList list = new MyLinkedList();
        list.remove(0);
    }

}
