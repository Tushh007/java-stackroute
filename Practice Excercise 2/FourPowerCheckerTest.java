package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourPowerCheckerTest {

    FourPowerChecker checker;

    @Before
    public void setUp() throws Exception {

        checker = new FourPowerChecker();

    }

    @After
    public void tearDown() throws Exception {

        checker = null;
    }

    @Test
    public void testFourPowerCheck() {

        assertTrue(checker.fourPowerCheck(1));

        assertTrue(checker.fourPowerCheck(16));

        assertTrue(checker.fourPowerCheck(1024));

    }

    @Test
    public void testFourPowerCheckFailure() {

        assertFalse(checker.fourPowerCheck(2342));

        assertFalse(checker.fourPowerCheck(124111));

        assertFalse(checker.fourPowerCheck(123123));

        assertFalse(checker.fourPowerCheck(23));
    }
}