package me.sungbin.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : DecimalFormatEx2
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class DecimalFormatEx2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " ->  ");

            System.out.println(df2.format(num));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
