package com.demo.driver.web.local;

import com.demo.driver.manager.web.local.ChromeManager;
import com.demo.driver.manager.web.local.FirefoxManager;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    LocalDriverFactory() {
    };

    public static WebDriver getDriver(BrowserType browserType) {
        WebDriver driver;
        return browserType == BrowserType.CHROME
                ? ChromeManager.getDriver()
                : FirefoxManager.getDriver();
    }
}
