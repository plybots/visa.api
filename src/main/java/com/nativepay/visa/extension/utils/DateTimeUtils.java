package com.nativepay.visa.extension.utils;

import org.threeten.bp.ZoneId;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class DateTimeUtils {
    private DateTimeUtils() {
    }

    /**
     * Converts this {@code TimeZone} object to a {@code org.threeten.bp.ZoneId}.
     *
     * @return a {@code org.threeten.bp.ZoneId} representing the same time zone as this {@code TimeZone}
     * @since 2.4.1
     */
    public static ZoneId timeZoneToZoneId(final TimeZone timeZone) {
        final String id = timeZone.getID();
        if (id.length() == 3) {
            if ("EST".equals(id))
                return ZoneId.of("America/New_York");
            if ("MST".equals(id))
                return ZoneId.of("America/Denver");
            if ("HST".equals(id))
                return ZoneId.of("America/Honolulu");
        }
        return ZoneId.of(id, ZoneId.SHORT_IDS);
    }

    public static Date getDateFromJulian7(String julianDate)
            throws ParseException
    {
        return new SimpleDateFormat("yyyyD").parse(julianDate);
    }

    public static String getJulian7FromDate(Date date) {
        StringBuilder sb = new StringBuilder();
        Calendar cal  = Calendar.getInstance();
        cal.setTime(date);

        return  sb.append(cal.get(Calendar.YEAR))
                .append(String.format("%03d", cal.get(Calendar.DAY_OF_YEAR)))
                .toString();
    }
}