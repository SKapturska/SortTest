
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import sorttest.CountTime;
import sorttest.Sort;

public class Tests extends TestWatcher {

    Sort sort;

    @Rule
    public CountTime stopwatch = new CountTime();

    public Tests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        sort = new Sort();
        sort.fillTable();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testQuicksort() {
        sort.quicksort(sort.numbers, 0, 9999999);
    }

}
