package com.demo.driver.factory.web.remote;

import com.demo.driver.manager.web.local.ChromeManager;
import com.demo.driver.manager.web.local.FirefoxManager;
import com.demo.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.demo.enums.BrowserRemoteModeType;
import com.demo.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {};

    private static final Map<BrowserRemoteModeType, Function<BrowserType, WebDriver>> MAP =
            new EnumMap<>(BrowserRemoteModeType.class);


    static {
        MAP.put(BrowserRemoteModeType.SELENOID, SelenoidFactory::getDriver);
        MAP.put(BrowserRemoteModeType.SELENIUM, SeleniumGridFactory::getDriver);
        MAP.put(BrowserRemoteModeType.BROWSERSTACK, BrowserstackFactory::getDriver);
    }


    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){
        return MAP.get(browserRemoteModeType).apply(browserType);
    };

/*
    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {

        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {
            return SeleniumGridFactory.getDriver(browserType);
       } else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {

        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSERSTACK) {

        } else {

        }
        return null;
    }
*/
}
