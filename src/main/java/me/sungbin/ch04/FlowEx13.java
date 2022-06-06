package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx13
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}
