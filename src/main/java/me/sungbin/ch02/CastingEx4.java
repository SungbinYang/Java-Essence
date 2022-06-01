package me.sungbin.ch02;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : CastingEx4
 * @date : 2022/06/01
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/01       rovert         최초 생성
 */

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float) i;
        int i2 = (int) f;

        double d = (double) i;
        int i3 = (int) d;

        float f2 = 1.666f;
        int i4 = (int) f2;

        System.out.printf("i=%d%n", i);
        System.out.printf("f=%f i2=%d%n", f, i2);
        System.out.printf("d=%f i3=%d%n", d, i3);
        System.out.printf("(int) %f=%d%n", f2, i4);
    }
}
