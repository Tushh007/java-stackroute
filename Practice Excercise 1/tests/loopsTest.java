import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class loopsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
    }

    @Test
    public void testiteration() {

        //String n = "7";

        loops test = new loops();

        String result = test.iteration(7);
        assertEquals("1223334444555556666667777777", result);

        String result1 = test.iteration(5);
        assertEquals("122333444455555", result1);

        String result2 = test.iteration(3);
        assertEquals("122333", result2);

    }
}