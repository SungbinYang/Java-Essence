package me.sungbin.ch06;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch06
 * @fileName : ConstructorTest
 * @date : 2022/06/13
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/13       rovert         최초 생성
 */

class Info1 {
    int value;
}

class Info2 {
    int value;

    public Info2(int value) {
        this.value = value;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Info1 i1 = new Info1();
//        Info2 i2 = new Info2();
    }
}
