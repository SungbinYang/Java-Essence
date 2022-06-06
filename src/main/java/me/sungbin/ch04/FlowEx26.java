package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx26
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while ((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
