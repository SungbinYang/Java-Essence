package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx27
 * @date : 2022/06/04
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/04       rovert         최초 생성
 */

public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.println();

        System.out.printf("ch=%c%n", ch);
        System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
        System.out.printf("!(ch < 'a' || ch > 'z')=%b%n", !('a' <= ch || ch >= 'z'));
        System.out.printf("   'a' <= ch && ch <= 'z' = %b%n", 'a' <= ch && ch >= 'z');
    }
}
