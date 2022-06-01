package me.sungbin.ch02;

/**
 * packageName : me.sungbin.ch02
 * fileName : FloatEx1
 * author : rovert
 * date : 2022/05/16
 * description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/05/16       rovert         최초 생성
 */

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890;

        System.out.printf("     12345678901234%n");
        System.out.printf("f:     %f%n", f); // 소수점 이하 6째자리까지 출력
        System.out.printf("f:   %24.20f%n", f);
        System.out.printf("f2:  %24.20f%n", f2);
        System.out.printf("d:   %24.20f%n", d);
    }
}
