package me.sungbin.ch10;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : CalendarEx9
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class CalendarEx9 {
    public static void main(String[] args) {
        System.out.println("2022. 07. 17 : " + getDayOfWeek(2022, 7, 17));
        System.out.println("2012. 06. 01 : " + getDayOfWeek(2012, 6, 1));
        System.out.println("2022. 07. 17 - 1996. 05. 22 : " + dayDiff(2022, 7, 17, 1996, 5, 22));
        System.out.println("2022. 6. 29 : " + convertDateToDay(2022, 6, 29));
        System.out.println("735778 : " + convertDayToDate(735778));
    }

    public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
    }

    public static int getDayOfWeek(int year, int month, int day) {
        return convertDateToDay(year, month, day) % 7 + 1;
    }

    public static String convertDayToDate(int day) {
        int year = 1;
        int month = 0;

        while (true) {
            int aYear = isLeapYear(year) ? 366 : 365;

            if (day > aYear) {
                day -= aYear;
                year++;
            } else {
                break;
            }
        }

        while (true) {
            int endDay = endOfMonth[month];

            if (isLeapYear(year) && month == 1) {
                endDay++;
            }

            if (day > endDay) {
                day -= endDay;
                month++;
            } else {
                break;
            }
        }

        return year + "-" + (month + 1) + "-" + day;
    }

    public static int convertDateToDay(int year, int month, int day) {
        int numberOfLeapYear = 0;

        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                numberOfLeapYear++;
            }
        }

        int toLastYearDaySum = (year - 1) * 365 + numberOfLeapYear;
        int thisYearDaySum = 0;

        for (int i = 0; i < month - 1; i++) {
            thisYearDaySum += endOfMonth[i];
        }

        if (month > 2 && isLeapYear(year)) {
            thisYearDaySum++;
        }

        thisYearDaySum += day;

        return toLastYearDaySum + thisYearDaySum;
    }
}
