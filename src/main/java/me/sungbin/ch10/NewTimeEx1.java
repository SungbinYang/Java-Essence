package me.sungbin.ch10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : NewTimeEx1
 * @date : 2022/07/18
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/18       rovert         최초 생성
 */

public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDay = LocalDate.of(1996, 5, 22);
        LocalTime birthTime = LocalTime.of(15, 0, 0);

        System.out.println("today = " + today);
        System.out.println("now = " + now);
        System.out.println("birthDay = " + birthDay);
        System.out.println("birthTime = " + birthTime);

        System.out.println(birthDay.withYear(2000));
        System.out.println(birthDay.plusDays(1));
        System.out.println(birthDay.plus(1, ChronoUnit.DAYS));

        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));

        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
        System.out.println(ChronoField.HOUR_OF_DAY.range());
    }
}
