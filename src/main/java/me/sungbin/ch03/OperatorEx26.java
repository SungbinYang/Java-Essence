package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx26
 * @date : 2022/06/04
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/04       rovert         최초 생성
 */

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b != 0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
    }
}
