package me.sungbin.ch09;

import java.util.StringTokenizer;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : StringTokenizerEx5
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";
        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for (String s : result) {
            System.out.print(s + "|");
        }

        System.out.println("개수: " + result.length);

        int i = 0;

        for (;st.hasMoreTokens(); i++) {
            System.out.print(st.nextToken() + "|");
        }

        System.out.println("개수: " + i);
    }
}
