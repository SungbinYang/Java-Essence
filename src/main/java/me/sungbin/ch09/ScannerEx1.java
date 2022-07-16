package me.sungbin.ch09;

import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : ScannerEx1
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while (true) {
            String prompt = ">>";
            System.out.print(prompt);

            String input = s.nextLine();

            input = input.trim();
            argArr = input.split(" +");

            String command = argArr[0].trim();

            if ("".equals(command)) {
                continue;
            }

            command = command.toLowerCase();

            if (command.equals("q")) {
                System.exit(0);
            } else {
                for (String value : argArr) {
                    System.out.println(value);
                }
            }
        }
    }
}
