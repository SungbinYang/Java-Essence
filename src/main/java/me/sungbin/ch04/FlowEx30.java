package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx30
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100) {
                break;
            }
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
