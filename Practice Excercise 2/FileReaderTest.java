package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileReaderTest {

    FileReader reader;

    @Before
    public void setUp() throws Exception {

        reader = new FileReader();
    }

    @After
    public void tearDown() throws Exception {

        reader = null;
    }

    @Test
    public void readFile(){

        assertEquals("HELLO WORLD",reader.readFile("hello world"));

        assertEquals("HOW IS EVERYTHING GOING",reader.readFile("how is Everything going"));
    }

    @Test
    public void fileLength() {
    }
}