package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    PalindromeChecker checker;
    @Before
    public void setUp() throws Exception {

        checker = new PalindromeChecker();
    }

    @After
    public void tearDown() throws Exception {

        checker = null;
    }

    @Test
    public void palindromeCheck() {

        assertTrue(checker.palindromeCheck("aba"));

        assertTrue(checker.palindromeCheck("malayalam"));

        assertTrue(checker.palindromeCheck("abrakaakarba"));

    }

    @Test
    public void palindromeCheckFailure() {

        assertFalse(checker.palindromeCheck("asfasfa"));

        assertFalse(checker.palindromeCheck("sdfadff"));

        assertFalse(checker.palindromeCheck("sfafara"));

    }
}