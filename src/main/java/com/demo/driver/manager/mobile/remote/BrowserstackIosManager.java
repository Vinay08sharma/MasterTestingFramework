package com.demo.driver.manager.mobile.remote;

import com.demo.config.factory.BrowserStackConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserstackIosManager {

    private BrowserstackIosManager (){};

    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.APP,"bs://e438d0649a9225db0ceedd2920cb87a27094cd87");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14 Pro Max");
        cap.setCapability("project","The one automation framework");
        cap.setCapability("build","bstack-demo");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackUrl(), cap);
    };
}
