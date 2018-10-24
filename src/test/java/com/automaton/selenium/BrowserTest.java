package com.automaton.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrowserTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1280, 1024));
    }

    @AfterEach
    void tearDown() {
        if (driver != null)
            driver.close(); // quit()
    }

    @Test
    void testResolution1(){
        Dimension resolution = new Dimension(800, 600);
        driver.manage().window().setSize(resolution);

        assertEquals(driver.manage().window().getSize().width, resolution.width, "Expected width 800!");
        assertEquals(driver.manage().window().getSize().height, resolution.height, "Expected height 600!");
    }

    @Test
    void testResolution2(){
        Dimension resolution = new Dimension(1280, 1024);
        driver.manage().window().setSize(resolution);

        assertEquals(driver.manage().window().getSize().width, resolution.width, "Expected width 1280!");
        assertEquals(driver.manage().window().getSize().height, resolution.height, "Expected height 1024!");
    }

    @Test
    void testResolution3(){
        Dimension resolution = new Dimension(1600, 1200);
        driver.manage().window().setSize(resolution);

        assertEquals(driver.manage().window().getSize().width, resolution.width, "Expected width 1600!");
        assertEquals(driver.manage().window().getSize().height, resolution.height, "Expected height 1200!");
    }

    @Test
    void testResolution4(){
        Dimension resolution = new Dimension(1680, 1050);
        driver.manage().window().setSize(resolution);

        assertEquals(driver.manage().window().getSize().width, resolution.width, "Expected width 1680!");
        assertEquals(driver.manage().window().getSize().height, resolution.height, "Expected height 1050!");
    }

    @Test
    void testResolution5(){
        Dimension resolution = new Dimension(1900, 1200);
        driver.manage().window().setSize(resolution);

        assertEquals(driver.manage().window().getSize().width, resolution.width, "Expected width 1900!");
        assertEquals(driver.manage().window().getSize().height, resolution.height, "Expected height 1200!");
    }
}
