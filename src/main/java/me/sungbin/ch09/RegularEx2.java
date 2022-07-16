package me.sungbin.ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : RegularEx2
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class RegularEx2 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "c", "cA", "ca", "co", "c.", "c0", "c#", "car", "combat", "count", "date", "disc"};
        String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", "c.", "c.*", "c\\.", "c\\w", "c\\d",
        "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}"};

        for (String s : pattern) {
            Pattern p = Pattern.compile(s);
            System.out.print("Pattern: " + s + " 결과: ");

            for (String datum : data) {
                Matcher m = p.matcher(datum);

                if (m.matches()) {
                    System.out.print(datum + ",");
                }
            }

            System.out.println();
        }
    }
}
