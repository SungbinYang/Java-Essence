package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx24
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);

            for (long j = 0; j < 6_000_000_000L; j++);
        }

        System.out.println("GAME OVER");
    }
}
