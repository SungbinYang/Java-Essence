package me.sungbin.ch10;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : CalendarEx8
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class CalendarEx8 {
    public static void main(String[] args) {
        String date1 = "202207";
        String date2 = "202104";

        int month1 = Integer.parseInt(date1.substring(0, 4)) * 12 + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0, 4)) * 12 + Integer.parseInt(date2.substring(4));

        System.out.println(date1 + "과 " + date2 + "의 차이는 " + Math.abs(month1 - month2) + "개월 입니다.");
    }
}
