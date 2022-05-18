package me.sungbin.ch02;

/**
 * packageName : me.sungbin.ch02
 * fileName : CastingEx2
 * author : rovert
 * date : 2022/05/18
 * description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/05/18       rovert         최초 생성
 */
public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i , b);

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i , b);

        b = 10;
        i = (int) b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b , i);

        b = -2;
        i = (int) b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

        System.out.println("i=" + Integer.toBinaryString(i));
    }
}
