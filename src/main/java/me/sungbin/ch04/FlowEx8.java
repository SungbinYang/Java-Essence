package me.sungbin.ch04;

import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx8
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) > ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender) {
            case '1', '3' -> System.out.println("당신은 남자입니다.");
            case '2', '4' -> System.out.println("당신은 여자입니다.");
            default -> System.out.println("유효하지 않은 주민등록번호입니다.");
        }

        scanner.close();
    }
}
