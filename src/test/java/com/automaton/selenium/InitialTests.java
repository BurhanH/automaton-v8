package com.automaton.selenium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class InitialTests {

    @Test
    public void testOne() {
        // Simple test. Expecting True
        String text = "Java is awesome!";
        String text1 = "Java is awesome!";
        assertEquals(text, text1);
    }

    @Test
    public void testTwo() {
        // Simple test. Expecting False
        String text = "Java is awesome!";
        String text1 = "Java";
        assertNotEquals(text, text1);
    }
}
