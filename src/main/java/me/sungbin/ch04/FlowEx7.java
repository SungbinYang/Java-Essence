package me.sungbin.ch04;

import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx7
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. > ");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴은 " + com + "입니다.");

        switch (user - com) {
            case 2, -1 -> System.out.println("당신이 졌습니다.");
            case 1, -2 -> System.out.println("당신이 이겼습니다.");
            case 0 -> System.out.println("비겼습니다.");
        }

        scanner.close();
    }
}