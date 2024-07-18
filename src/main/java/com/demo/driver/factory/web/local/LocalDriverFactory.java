package com.demo.driver.factory.web.local;

import com.demo.driver.manager.web.local.ChromeManager;
import com.demo.driver.manager.web.local.FirefoxManager;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private static final Map<BrowserType, Supplier<WebDriver>>
            MAP = new EnumMap<>(BrowserType.class);
//    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
//    private static final Supplier<WebDriver> FIREFOX = FirefoxManager::getDriver;


//    static {
//        MAP.put(BrowserType.CHROME, CHROME);
//        MAP.put(BrowserType.FIREFOX, FIREFOX);
//    }

    //OR

    static {
        MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, FirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }

    private LocalDriverFactory() {};
}
