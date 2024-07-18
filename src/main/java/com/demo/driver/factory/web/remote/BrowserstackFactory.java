package com.demo.driver.factory.web.remote;

import com.demo.driver.manager.web.local.ChromeManager;
import com.demo.driver.manager.web.local.FirefoxManager;
import com.demo.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.demo.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserstackFactory {

    private BrowserstackFactory(){};

    private static final Map<BrowserType, Supplier<WebDriver>>
            MAP = new EnumMap<>(BrowserType.class);


    static {
        MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, BrowserStackFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }

//    public static RemoteWebDriver getDriver(BrowserType browserType) {
//        return browserType == BrowserType.CHROME
//                ? BrowserStackChromeManager.getDriver()
//                : BrowserStackFirefoxManager.getDriver();
//    }
}
