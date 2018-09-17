package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable member;

    @Before
    public void setUp() throws Exception {

        member = new MemberVariable("John",44,23422);
    }

    @After
    public void tearDown() throws Exception {

        member = null;

    }

    @Test
    public void getName() {

        assertEquals("John", member.getName());

    }

    @Test
    public void getAge() {

        assertEquals(44, member.getAge());

    }

    @Test
    public void getSalary() {

        assertEquals(23422, member.getSalary());

    }
}