package me.sungbin.ch04;

import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx6
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. > ");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3, 4, 5 -> System.out.println("현재 계절은 봄입니다.");
            case 6, 7, 8 -> System.out.println("현재 계절은 여름입니다.");
            case 9, 10, 11 -> System.out.println("현재 계절은 가을입니다.");
            default -> System.out.println("현재의 계절은 거울입니다.");
        }

        scanner.close();
    }
}
