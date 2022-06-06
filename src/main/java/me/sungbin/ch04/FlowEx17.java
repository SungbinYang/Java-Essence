package me.sungbin.ch04;

import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx17
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx17 {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하시오. > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
