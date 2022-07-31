package me.sungbin.ch11;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : AsciiPrint
 * @date : 2022/07/30
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/30       rovert         최초 생성
 */

public class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';

        for (int i = 0; i < 95; i++) {
            System.out.print(ch++);
        }
    }
}
