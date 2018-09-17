package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeAnalyserTest {

    GradeAnalyser analyser;

    @Before
    public void setUp() throws Exception {

        int[] gradeArray = {1,3};
        analyser = new GradeAnalyser(2,gradeArray);

    }

    @After
    public void tearDown() throws Exception {

        analyser = null;

    }

    @Test
    public void average() {

        assertEquals(2,analyser.average());

    }

    @Test
    public void minimum() {

        assertEquals(1,analyser.minimum());

    }

    @Test
    public void maximum() {

        assertEquals(3,analyser.maximum());

    }
}