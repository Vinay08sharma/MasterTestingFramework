package com.demo.config.converters;

import lombok.SneakyThrows;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.net.URL;

public class StringToURLConverter implements Converter<URL> {
    @SneakyThrows
    @Override
    public URL convert(Method method, String stringUrl) {
        return new URL(stringUrl);
    }
}
