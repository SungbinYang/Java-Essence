package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx30
 * @date : 2022/06/04
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/04       rovert         최초 생성
 */

public class OperatorEx30 {
    /**
     * 2진수를 문저열로 변환하는 메소드
     * @param x
     * @return
     */
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String temp = zero + Integer.toBinaryString(x);

        return temp.substring(temp.length() - 32);
    }

    public static void main(String[] args) {
        int dec = 8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

        dec = 8;
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
    }
}
