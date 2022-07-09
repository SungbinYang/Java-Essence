package me.sungbin.ch09;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : StringEx3
 * @date : 2022/07/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/03       rovert         최초 생성
 */

public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
