package com.demo.driver.web.remote;

import com.demo.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.demo.driver.manager.web.remote.selenoid.SelenoidGridFirefoxManager;
import com.demo.enums.BrowserType;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidFactory {

    private SelenoidFactory (){};

    public static RemoteWebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidGridFirefoxManager.getDriver();
    }
}
