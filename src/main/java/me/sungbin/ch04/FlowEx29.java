package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx29
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d ", i);

            int tmp = i;

            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
                    System.out.print("짝");
                }
            } while ((tmp /= 10) != 0);

            System.out.println();
        }
    }
}
