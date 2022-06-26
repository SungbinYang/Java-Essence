package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : InnerEx2
 * @date : 2022/06/25
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/25       rovert         최초 생성
 */

public class InnerEx2 {

    class InstanceInner {

    }

    static class StaticInner {

    }

    InstanceInner iv = new InstanceInner();
    static  StaticInner cv = new StaticInner();

    static void staticMethod() {
        // static 멤버는 인스턴스멤버에 직접 접근할 수 없다.
//        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//        LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {}

        LocalInner lv = new LocalInner();
    }
}
