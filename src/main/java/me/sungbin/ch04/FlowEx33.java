package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx33
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1: for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1;
//                    break;
//                    continue Loop1;
//                    continue;
                }
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
