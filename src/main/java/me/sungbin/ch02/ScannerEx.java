package me.sungbin.ch02;

import java.util.Scanner;

/**
 * packageName : me.sungbin.ch02
 * fileName : ScannerEx
 * author : rovert
 * date : 2022/05/11
 * description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/05/11       rovert         최초 생성
 */

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요. >");

        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력 내용: " + input);
        System.out.printf("num=%d%n", num);

        scanner.close();
    }
}
