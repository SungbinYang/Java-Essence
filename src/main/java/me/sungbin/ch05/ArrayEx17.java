package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx17
 * @date : 2022/06/08
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/08       rovert         최초 생성
 */

public class ArrayEx17 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case 'x' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> System.out.println("지원되지 않는 연산입니다.");
        }

        System.out.println("result = " + result);
    }
}
