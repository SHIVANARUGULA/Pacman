package com.comp6442.assignment.pacman;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testcheckCollided() {
        ClassToTestMethod classTest = new ClassToTestMethod();
        assertTrue(classTest.checkCollided(50, 50, 50));


    }
    @Test
    public void testMidPoints(){
        ClassToTestMethod classTest = new ClassToTestMethod();
        assertEquals(100, classTest.midpointX(100, 100), 0.001);
        assertEquals(100, classTest.midpointY(100, 100), 0.001);
    }
}