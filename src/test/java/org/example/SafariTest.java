package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

    static  {
        String myPath = SeleniumManager.getInstance().getDriverPath("msedgedriver");
        System.out.println("Path to binary -> " + myPath);
    }

    @Test
    public void safariTest() {

        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}