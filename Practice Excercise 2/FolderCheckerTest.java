package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FolderCheckerTest {

    FolderChecker checker;

    @Before
    public void setUp() throws Exception {

        checker = new FolderChecker();

    }

    @After
    public void tearDown() throws Exception {

        checker = null;

    }

    @Test
    public void checkFolder() {
        String[] fileList = {"com"};
        assertEquals(fileList, checker.checkFolder("/home/cgi/JavaPractice2/src"));
    }
}