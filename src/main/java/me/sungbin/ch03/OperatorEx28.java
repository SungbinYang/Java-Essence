package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx28
 * @date : 2022/06/04
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/04       rovert         최초 생성
 */

public class OperatorEx28 {
    public static void main(String[] args) {
        int x = 0xAB, y = 0xF;

        System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
        System.out.printf("%#X  |  %#X = %#X \t%s%n", x, y, x | y , toBinaryString(x | y));
        System.out.printf("%#X  &  %#X = %#X \t%s%n", x, y, x & y , toBinaryString(x & y));
        System.out.printf("%#X  ^  %#X = %#X \t%s%n", x, y, x ^ y , toBinaryString(x ^ y));
        System.out.printf("%#X  ^  %#X ^ %#X = %#X \t%s%n", x, y, y, x ^ y ^ y , toBinaryString(x ^ y ^ y));
    }

    /**
     * 2진수를 문자열로 변환하는 메소드
     * @param x
     * @return
     */
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String temp = zero + Integer.toBinaryString(x);

        return temp.substring(temp.length() - 32);
    }
}
