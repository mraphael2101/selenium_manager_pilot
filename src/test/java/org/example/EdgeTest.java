package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class EdgeTest {

    static  {
        String myPath = SeleniumManager.getInstance().getDriverPath("msedgedriver");
        System.out.println("Path to binary -> " + myPath);
    }

    @Test
    public void edgeTest() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}