package com.demo.tests;

import com.demo.config.factory.BrowserStackConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin() {
        System.out.println(BrowserStackConfigFactory.getConfig().browserStackUrl());
    }
}
