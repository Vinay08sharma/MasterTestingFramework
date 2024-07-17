package com.demo.tests;

import com.demo.driver.web.local.LocalDriverFactory;
import com.demo.enums.BrowserType;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin() {
        LocalDriverFactory.getDriver(BrowserType.CHROME);
    }
}
