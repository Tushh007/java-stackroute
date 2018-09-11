import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ConsonantVowelTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCheck() {

        ConsonantVowel test = new ConsonantVowel();

        String result = test.Check("AeOuIndia");

        assertEquals("A - is a vowel e - is a vowel O - is a vowel u - is a vowel I - is a vowel n - is a consonent d - is a consonent i - is a vowel a - is a vowel", result);

    }
}