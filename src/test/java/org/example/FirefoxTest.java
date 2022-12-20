package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;


public class FirefoxTest {

    static  {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        System.out.println(cpu.getProcessorIdentifier());

        String myPath = SeleniumManager.getInstance().getDriverPath("chromedriver");
        System.out.println("Path to binary -> " + myPath);
    }

    @Test
    public void firefoxTest() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
