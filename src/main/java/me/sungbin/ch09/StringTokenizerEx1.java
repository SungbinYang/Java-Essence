package me.sungbin.ch09;

import java.util.StringTokenizer;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : StringTokenizerEx1
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
