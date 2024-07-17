package com.demo.config;

import com.demo.config.converters.StringToBrowserTypeConverter;
import com.demo.config.converters.StringToURLConverter;
import com.demo.enums.BrowserRemoteModeType;
import com.demo.enums.BrowserType;
import com.demo.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

/**
 * Order of precedence for configuration properties:
 * 1. system.properties - checks if a value is passed through Maven properties.
 * 2. system.env - checks if a value is set as an environment variable (e.g., in CI).
 * 3. file - if neither of the above is set, it loads the property from the specified file.
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();// since keyname is same as string name no need to mention it

    @ConverterClass(StringToURLConverter.class)
    URL selenoidGridUrl(); // since keyname is same as string name no need to mention it
}
