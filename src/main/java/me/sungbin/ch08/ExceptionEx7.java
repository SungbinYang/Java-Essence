package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : ExceptionEx7
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("true");
            }

            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println(6);
    }
}
