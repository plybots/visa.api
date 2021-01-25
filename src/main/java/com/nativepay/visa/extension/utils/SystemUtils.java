package com.nativepay.visa.extension.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class SystemUtils {
    public static int randomNumber() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 100000 + r.nextInt(100000));
    }

    public static String generateRetrievalReferenceNumber(int systemsTraceAuditNumber){
        return String.format("%s%d", DateTimeUtils.getJulian7FromDate(new Date()), systemsTraceAuditNumber);
    }

    public static String generateLocalTransactionDateTime(){
        String DATE_DISPLAY_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_DISPLAY_FORMAT, Locale.US));
    }
}
