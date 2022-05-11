package me.sungbin.ch02;

/**
 * packageName : me.sungbin.ch02
 * fileName : VarEx2
 * author : rovert
 * date : 2022/05/11
 * description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/05/11       rovert         최초 생성
 */

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x: " + x + " y: " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + " y: " + y);
    }
}
