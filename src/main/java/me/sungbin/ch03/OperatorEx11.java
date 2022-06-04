package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx11
 * @date : 2022/06/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/03       rovert         최초 생성
 */

public class OperatorEx11 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c' = %d%n", a, (int) a);
        System.out.printf("'%c' = %d%n", d, (int) d);
        System.out.printf("'%c' = %d%n", zero, (int) zero);
        System.out.printf("'%c' = %d%n", two, (int) two);
    }
}
