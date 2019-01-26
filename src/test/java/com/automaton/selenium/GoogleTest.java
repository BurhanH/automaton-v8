package com.automaton.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

class GoogleTest {

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
    void testGoogle() {
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Java");
        element.submit();

        WebElement element1 = driver.findElement(By.cssSelector(".bNg8Rb"));
        element1.isDisplayed();
    }

}
