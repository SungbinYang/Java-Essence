package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : BindingTest2
 * @date : 2022/06/19
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/19       rovert         최초 생성
 */

class Parent4 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child4 extends Parent4 {

}

public class BindingTest2 {
    public static void main(String[] args) {
        Parent4 p = new Child4();
        Child4 c = new Child4();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}
