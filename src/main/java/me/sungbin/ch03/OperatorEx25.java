package me.sungbin.ch03;

import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx25
 * @date : 2022/06/04
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/04       rovert         최초 생성
 */

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자를 하나 입력하세요. > ");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자입니다.");
        }

        scanner.close();
    }
}
