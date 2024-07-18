package com.demo.driver.factory.mobile.remote;

import com.demo.driver.manager.mobile.remote.BrowserstackAndroidManager;
import com.demo.driver.manager.mobile.remote.BrowserstackIosManager;
import com.demo.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.demo.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.demo.enums.BrowserType;
import com.demo.enums.MobilePlatfromType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class MobileBrowserstackFactory {

    private MobileBrowserstackFactory(){};

    private static final Map<MobilePlatfromType, Supplier<WebDriver>>
            MAP = new EnumMap<>(MobilePlatfromType.class);


    static {
        MAP.put(MobilePlatfromType.ANDROID, BrowserstackAndroidManager::getDriver);
        MAP.put(MobilePlatfromType.IOS, BrowserstackIosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatfromType mobilePlatfromType) {
        return MAP.get(mobilePlatfromType).get();
    }

//    public static RemoteWebDriver getDriver(BrowserType browserType) {
//        return browserType == BrowserType.CHROME
//                ? BrowserStackChromeManager.getDriver()
//                : BrowserStackFirefoxManager.getDriver();
//    }
}
