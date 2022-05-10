package com.workshop.mongodb.workshopmongodb.resources.util;

import org.springframework.stereotype.Component;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Component
public class URL {

    public static String decodeParam(String text){
        return URLDecoder.decode(text, StandardCharsets.UTF_8);
    }

    public static Date convertDate(String textDate, Date defaultValue) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            return sdf.parse(textDate);
        } catch (ParseException e) {
            return defaultValue;
        }
    }

}
