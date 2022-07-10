package me.sungbin.ch09;

import static java.lang.Math.negateExact;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : MathEx2
 * @date : 2022/07/10
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/10       rovert         최초 생성
 */

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println("i = " + i);
        System.out.println("-i = " + (-i));

        try {
            System.out.printf("negateExact(%d) = %d%n", 10, negateExact(10));
            System.out.printf("negateExact(%d) = %d%n", -10, negateExact(-10));
            System.out.printf("negateExact(%d) = %d%n", i, negateExact(i));
        } catch (ArithmeticException e) {
            System.out.printf("negateExact(%d) = %d%n", (long) i, negateExact((long) i));
        }
    }
}
