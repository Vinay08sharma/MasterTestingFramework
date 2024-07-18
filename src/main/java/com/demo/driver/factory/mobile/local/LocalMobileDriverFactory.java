package com.demo.driver.factory.mobile.local;

import com.demo.driver.manager.mobile.local.AndroidManager;
import com.demo.driver.manager.mobile.local.IosManager;
import com.demo.enums.MobilePlatfromType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

    private static final Map<MobilePlatfromType, Supplier<WebDriver>>
            MAP = new EnumMap<>(MobilePlatfromType.class);
//    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
//    private static final Supplier<WebDriver> FIREFOX = FirefoxManager::getDriver;


//    static {
//        MAP.put(BrowserType.CHROME, CHROME);
//        MAP.put(BrowserType.FIREFOX, FIREFOX);
//    }

    //OR

    static {
        MAP.put(MobilePlatfromType.ANDROID, AndroidManager::getDriver);
        MAP.put(MobilePlatfromType.IOS, IosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatfromType mobilePlatfromType) {
        return MAP.get(mobilePlatfromType).get();
    }

    private LocalMobileDriverFactory() {};
}
