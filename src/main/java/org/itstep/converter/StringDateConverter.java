package org.itstep.converter;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateConverter implements Converter<String, Date> {

    private final SimpleDateFormat dateFormat;

    public StringDateConverter() {
        this("yyyy-MM-dd");
    }

    public StringDateConverter(String dateFormatString) {
        this.dateFormat = new SimpleDateFormat(dateFormatString);
    }

    @Override
    public Date convert(String s) {
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
