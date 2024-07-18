package com.demo.driver.manager.web.remote.selenoid;

import com.demo.config.factory.ConfigFactory;
import com.demo.enums.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidGridFirefoxManager {

    private SelenoidGridFirefoxManager (){};

    public static RemoteWebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", String.valueOf(BrowserType.FIREFOX));
        cap.setCapability("browser_version", "latest");
        cap.setCapability("enableVnc", true);
        cap.setCapability("enableVideo", true);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidGridUrl(),cap);
    }
}
