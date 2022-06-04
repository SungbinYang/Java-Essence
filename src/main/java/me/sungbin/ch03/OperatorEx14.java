package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx14
 * @date : 2022/06/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/03       rovert         최초 생성
 */

public class OperatorEx14 {
    public static void main(String[] args) {
        char c = 'a';

        for (int i = 0; i < 26; i++) {
            System.out.print(c++);
        }
        System.out.println();

        c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print(c++);
        }
        System.out.println();

        c = '0';
        for (int i = 0; i < 10; i++) {
            System.out.print(c++);
        }
        System.out.println();
    }
}
