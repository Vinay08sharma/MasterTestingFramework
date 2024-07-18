package com.demo.driver.manager.mobile.remote;

import com.demo.config.factory.BrowserStackConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserstackAndroidManager {

    private BrowserstackAndroidManager (){};

    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.APP,"bs://e438d0649a9225db0ceedd2920cb87a27094cd87");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Google Pixel 7 Pro");
        cap.setCapability("project","The one automation framework");
        cap.setCapability("build","bstack-demo");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackUrl(), cap);
    };
}
