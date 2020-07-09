package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeUtil {
    public static String getCurrentTimeForApi(){
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date1 = currentTime.toLocalDate();
        return date1.toString();
    }
    public static String getPastTimeForApi(int days){
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date1 = currentTime.toLocalDate();
        LocalDate past = date1.minus(1, ChronoUnit.DAYS);
        return past.toString();
    }
}
