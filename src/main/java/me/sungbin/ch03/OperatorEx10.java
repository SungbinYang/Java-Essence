package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx10
 * @date : 2022/06/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/03       rovert         최초 생성
 */

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
        System.out.printf("%d * %d / %d = %d%n", a, a, a, result2);
    }
}
