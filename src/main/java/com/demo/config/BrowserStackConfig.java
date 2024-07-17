package com.demo.config;

import com.demo.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Converter;

import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {


    @Key("username")
    String userName();

    String key();

    @DefaultValue("BS link")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackUrl();
}
