package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx14
 * @date : 2022/06/08
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/08       rovert         최초 생성
 */

public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + "): " + ch);
        }

        char[] cArr = src.toCharArray();

        System.out.println(cArr);
    }
}
