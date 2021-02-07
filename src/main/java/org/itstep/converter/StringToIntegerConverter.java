package org.itstep.converter;

import org.springframework.core.convert.converter.Converter;

public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String s) {
        System.out.println("Convert " + s);
        return Integer.valueOf(s);
    }
}
