package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialClassTest {

    FactorialClass factorialObj;
    @Before
    public void setUp() throws Exception {

        factorialObj = new FactorialClass();
    }

    @After
    public void tearDown() throws Exception {

        factorialObj = null;
    }

    @Test
    public void getFactorial() {

        assertEquals(120,factorialObj.getFactorial(5));

    }



}