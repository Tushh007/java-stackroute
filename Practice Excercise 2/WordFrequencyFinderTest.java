package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyFinderTest {

    WordFrequencyFinder finder;

    @Before
    public void setUp() throws Exception {

        finder = new WordFrequencyFinder();

    }

    @After
    public void tearDown() throws Exception {

        finder = null;

    }

    @Test
    public void readFromFile() {

        assertEquals("i am a man , \n" +
                "i like to sleep , \n" +
                "i have a home.\n" +
                "\n", finder.readFromFile("/home/cgi/JavaPractice2/src/com/company/sample.txt"));
    }
}