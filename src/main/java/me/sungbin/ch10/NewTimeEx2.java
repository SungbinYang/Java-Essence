package me.sungbin.ch10;

import java.time.*;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : NewTimeEx2
 * @date : 2022/07/23
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/23       rovert         최초 생성
 */

public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 7, 30);
        LocalTime time = LocalTime.of(12,34,56);

        LocalDateTime dt = LocalDateTime.of(date, time);

        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zid);

        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(dt);
        System.out.println(zid);
        System.out.println(zdt);
        System.out.println(seoulTime);
        System.out.println(nyTime);
        System.out.println(odt);
    }
}
