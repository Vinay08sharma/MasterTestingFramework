package com.demo.driver.web.remote;

import com.demo.enums.BrowserRemoteModeType;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {};

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {

        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {
            return SeleniumGridFactory.getDriver(browserType);
       } else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {

        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSERSTACK) {

        } else {

        }
        return null;
    }
}
