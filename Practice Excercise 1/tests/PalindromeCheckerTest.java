import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testreverse() {
        int num0 = 12321;
        int num1 = 12345;

        PalindromeChecker test = new PalindromeChecker();

        int result = test.reverse(num0);
        assertEquals(12321, result);

        int result1 = test.reverse(num1);
        assertEquals(54321, result1);

    }

    @Test
    public void testsum() {
        int num2 = 12345;
        int num3 = 8642468;

        PalindromeChecker test1 = new PalindromeChecker();

        int result2 = test1.sum(num2);
        assertEquals(6, result2);

        int result3 = test1.sum(num3);
        assertEquals(38, result3);
    }
}