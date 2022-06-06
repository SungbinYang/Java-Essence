package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx18
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
        }
    }
}
