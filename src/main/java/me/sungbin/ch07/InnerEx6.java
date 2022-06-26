package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07.book
 * @fileName : InnerEx6
 * @date : 2022/06/25
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/25       rovert         최초 생성
 */

public class InnerEx6 {
    Object iv = new Object() {
        void method() {}
    };

    static Object cv = new Object() {
        void method() {}
    };

    void myMethod() {
        Object lv = new Object() {
            void method() {}
        };
    }
}
