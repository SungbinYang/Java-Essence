package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : ExceptionEx2
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

public class ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10);
            System.out.println(result);
        }
    }
}
