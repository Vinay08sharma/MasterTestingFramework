package com.demo.driver.factory.web.remote;

import com.demo.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.demo.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.demo.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.demo.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridFactory {
    private SeleniumGridFactory (){};

    private static final Map<BrowserType, Supplier<WebDriver>>
            MAP = new EnumMap<>(BrowserType.class);


    static {
        MAP.put(BrowserType.CHROME, SeleniumGridChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, SeleniumGridFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }
}
