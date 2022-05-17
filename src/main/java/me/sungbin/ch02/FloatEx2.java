package me.sungbin.ch02;

/**
 * packageName : me.sungbin.ch02
 * fileName : FloatEx2
 * author : rovert
 * date : 2022/05/17
 * description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/05/17       rovert         최초 생성
 */

public class FloatEx2 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i);
    }
}
