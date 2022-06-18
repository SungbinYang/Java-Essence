package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : SuperTest
 * @date : 2022/06/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/17       rovert         최초 생성
 */

class Parent {
    int x = 10;
}

class Child extends Parent {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
