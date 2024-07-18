package com.demo.driver;

import com.demo.config.factory.ConfigFactory;
import com.demo.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    static WebDriver driver = null;

    public static void initDriver() { // LocalDriverFactory
        driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://google.com");
    }

    public static void quitDriver(){
         driver.quit();
    }
}
