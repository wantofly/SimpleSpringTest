package com.cginfo.test.simplespring.util;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

public class XmlDateTimeCustomBinder {
    
    public static Date parseDateTime(String s) {
        Date date;
        try {
            date = DatatypeConverter.parseDateTime(s).getTime();
        } catch (Exception ex) {
            date = null;
        }
        return date;
    }

    public static String printDateTime(Date dtm) {
        if (dtm == null)
            return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(dtm);
        return DatatypeConverter.printDateTime(cal);
    }
}