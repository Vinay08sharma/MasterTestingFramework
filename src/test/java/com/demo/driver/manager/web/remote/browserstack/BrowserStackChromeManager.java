package com.demo.driver.manager.web.remote.browserstack;

import com.demo.config.factory.BrowserStackConfigFactory;
import com.demo.enums.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackChromeManager {

    private BrowserStackChromeManager(){
    };

    public static RemoteWebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", String.valueOf(BrowserType.CHROME));
        cap.setCapability("browserVersion", "97.0");
        cap.setCapability("enableVnc", true);
        cap.setCapability("enableVideo", true);
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackUrl(), cap);
    }
}
