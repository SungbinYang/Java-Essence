package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : FinallyTest3
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */
public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println("method1 메서드의 수행을 마치고 main 메서드로 돌아왔습니다.");
    }

    static void method1() {
        try {
            System.out.println("method1 메서드가 호출되었습니다.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1 메서드의 finally 블록이 실행되었습니다.");
        }
    }
}
