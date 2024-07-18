package com.demo.driver.factory.mobile.remote;

import com.demo.driver.factory.web.remote.BrowserstackFactory;
import com.demo.driver.factory.web.remote.SeleniumGridFactory;
import com.demo.driver.factory.web.remote.SelenoidFactory;
import com.demo.enums.BrowserRemoteModeType;
import com.demo.enums.BrowserType;
import com.demo.enums.MobilePlatfromType;
import com.demo.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory() {};

    private static final Map<MobileRemoteModeType, Function<MobilePlatfromType, WebDriver>> MAP =
            new EnumMap<>(MobileRemoteModeType.class);


    static {
//        MAP.put(MobileRemoteModeType.BROWSER_STACK, ::getDriver);
//        MAP.put(MobileRemoteModeType.SAUCE_LABS, MobileBrowserstackFactory::getDriver);
    }


    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatfromType mobilePlatfromType){
        return MAP.get(mobileRemoteModeType).apply(mobilePlatfromType);
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
