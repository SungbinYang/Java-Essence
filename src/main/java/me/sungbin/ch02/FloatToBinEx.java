package me.sungbin.ch02;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : FlaotToBinEx
 * @date : 2022/06/01
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/01       rovert         최초 생성
 */

public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i);
    }
}
