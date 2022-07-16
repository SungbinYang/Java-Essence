package me.sungbin.ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : RegularEx1
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
        Pattern p = Pattern.compile("c[a-z]*");

        for (String datum : data) {
            Matcher matcher = p.matcher(datum);

            if (matcher.matches()) {
                System.out.print(datum + ",");
            }
        }
    }
}
