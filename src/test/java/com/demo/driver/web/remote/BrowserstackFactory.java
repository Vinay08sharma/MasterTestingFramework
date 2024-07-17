package com.demo.driver.web.remote;

import com.demo.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.demo.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.demo.enums.BrowserType;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserstackFactory {

    private BrowserstackFactory(){};

    public static RemoteWebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }
}
