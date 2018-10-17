package com.automaton.selenium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class InitialTest {

    @Test
    public void testOne(){
        // Simple test. Expecting True
        assertTrue(new String("Java is awesome!").equals("Java is awesome!"));
    }

    @Test
    public void testTwo(){
        // Simple test. Expecting False
        assertFalse(new String("Java is interesting!") == "Java is interesting!");
    }

    @Test
    public void testThree(){
        // Expecting True
        assertTrue("Java!" == "Java!");
    }

    @Test
    public void testFour(){
        // Expecting False
        assertFalse(new String("Java programming language") == new String("Java programming language"));
    }

    @Test
    public void testFive(){
        // Expecting True
        assertTrue(new String("Java is awesome!").intern() == "Java is awesome!");
    }
}
