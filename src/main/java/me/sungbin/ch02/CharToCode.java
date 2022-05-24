package me.sungbin.ch02;

/**
 * packageName : me.sungbin.ch02
 * fileName : CharToCode
 * author : rovert
 * date : 2022/05/12
 * description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/05/12       rovert         최초 생성
 */

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int) ch;

        System.out.printf("%c=%d(%X) %n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X) %n", hch, (int) hch, (int) hch);

        char tch = '&';
        System.out.printf("%c=%d(%X) %n", tch, (int) tch, (int) tch);
    }
}
