package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx8
 * @date : 2022/06/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/03       rovert         최초 생성
 */

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;

        System.out.println(c);
    }
}
