package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : ExceptionEx14
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        throw new Exception();
    }
}
