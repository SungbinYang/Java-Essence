package me.sungbin.ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : ImportTest
 * @date : 2022/06/18
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/18       rovert         최초 생성
 */

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }
}
