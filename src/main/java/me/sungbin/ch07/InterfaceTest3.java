package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : InterfaceTest3
 * @date : 2022/06/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/20       rovert         최초 생성
 */

class A3 {
    void methodA() {
        I2 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i);
    }
}

interface I2 {
    public abstract void methodB();
}

class B3 implements I2 {

    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }

    @Override
    public String toString() {
        return "class B";
    }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B3();
    }
}

public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}
