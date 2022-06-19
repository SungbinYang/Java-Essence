package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : SingletonTest
 * @date : 2022/06/18
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/18       rovert         최초 생성
 */

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s ==  null) {
            s = new Singleton();
        }

        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}
