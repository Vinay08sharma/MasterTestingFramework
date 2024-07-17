package com.demo.tests;

import com.demo.config.ConfigFactory;
import com.demo.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin() {

        System.out.println("Current browser: " + ConfigFactory.getConfig().browser());

        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://google.com");
        // driver.quit();
    }
}
