package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx13
 * @date : 2022/06/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/03       rovert         최초 생성
 */

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

//        char c2 = c1 + 1; ERROR
        char c2 = 'a' + 1;

        System.out.println("c2 = " + c2);
    }
}
