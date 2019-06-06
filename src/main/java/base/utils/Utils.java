package base.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Utils {

    public static String getUnixDateTime() {
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
        String formattedDate = localDate.format(formatterDate);
        return formattedDate;
    }

    public static long getUnixTimeStamp() {
        return Instant.now().getEpochSecond();
    }

    public static long getTimeStamp() {
        return new Date().getTime();
    }
}
