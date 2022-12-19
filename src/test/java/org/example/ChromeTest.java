package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class ChromeTest {

    static  {
        String myPath = SeleniumManager.getInstance().getDriverPath("chromedriver");
        System.out.println("Path to binary -> " + myPath);
    }

    @Test
    public void chromeTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
