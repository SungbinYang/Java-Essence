package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : ExceptionEx9
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;
        } catch (Exception e) {
            System.out.println("에러메세지: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램이 정상 종료되었음.");
    }
}
