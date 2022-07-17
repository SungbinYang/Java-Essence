package me.sungbin.ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : DateFormatEx4
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예:2022/07/17)");

        while (s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요. (입력예:2022/07/17)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);

        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);

        System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
    }
}
