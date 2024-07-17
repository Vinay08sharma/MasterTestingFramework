package com.demo.driver.web.remote;

import com.demo.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.demo.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory (){};

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();
    }
}
