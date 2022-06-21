package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : InterfaceTest2
 * @date : 2022/06/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/20       rovert         최초 생성
 */

class A2 {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B2 implements I {

    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I {

    @Override
    public void play() {
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());
        a.autoPlay(new C());
    }
}
