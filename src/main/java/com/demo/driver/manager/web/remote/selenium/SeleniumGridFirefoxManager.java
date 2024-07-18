package com.demo.driver.manager.web.remote.selenium;

import com.demo.config.factory.ConfigFactory;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridFirefoxManager {

    private SeleniumGridFirefoxManager (){};
    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(String.valueOf(BrowserType.FIREFOX));
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(),cap);
    }
}
