package me.sungbin.ch09;

import java.util.StringTokenizer;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : StringTokenizerEx2
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
