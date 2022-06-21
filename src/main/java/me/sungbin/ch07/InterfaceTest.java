package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : InterfaceTest
 * @date : 2022/06/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/20       rovert         최초 생성
 */

class A {
    public void methodA(B b) {
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
