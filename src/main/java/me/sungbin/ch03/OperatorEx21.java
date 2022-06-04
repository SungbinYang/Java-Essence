package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx21
 * @date : 2022/06/04
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/04       rovert         최초 생성
 */

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f  \t %b%n", 10==10.0f);
        System.out.printf("'0' == 0     \t %b%n", '0'== 0);
        System.out.printf("'A' == 65    \t %b%n", 'A' == 65);
        System.out.printf("'A' > 'B'    \t %b%n", 'A' > 'B');
        System.out.printf("'A'+1 != 'B' \t %b%n", 'A' + 1 != 'B');
    }
}
