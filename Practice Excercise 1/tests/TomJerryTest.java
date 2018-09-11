import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testoddeven() {

        int num0 = 15;
        int num1 = 25;
        int num2 = 26;
        int num3 = 36;

        TomJerry test = new TomJerry();

        String result = test.oddeven(num0);
        assertEquals("odd", result);

        String result1 = test.oddeven(num1);
        assertEquals("odd", result1);

        String result2 = test.oddeven(num2);
        assertEquals("even", result2);

        String result3 = test.oddeven(num3);
        assertEquals("even", result3);
    }
}