package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : DefaultMethodTest
 * @date : 2022/06/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/20       rovert         최초 생성
 */

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

class Parent6 {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

class Child6 extends Parent6 implements MyInterface, MyInterface2 {

    @Override
    public void method1() {
        System.out.println("method1() in Child");
    }
}

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child6 c = new Child6();
        c.method1();
        c.method2();

        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
