package com.bhattaraibikash.testingapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

    Arithmetic arithmetic = null;

    @Before
    public void setUp() {
        arithmetic = new Arithmetic();
    }

    @Test
    public void checkAdd() {
        float expected = 12;
        float actual = arithmetic.add(10, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void checkSubtract() {
        float expected = 4;
        float actual = arithmetic.subtract(6, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void checkDivide() {
        float expected = 4;
        float actual = arithmetic.divide(8, 2);
        assertEquals(actual, expected);
    }

    @After
    public void tearDown() {
        arithmetic = null;
    }

}
