package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : FinalCardTest
 * @date : 2022/06/18
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/18       rovert         최초 생성
 */

class Card2 {
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 250;

    public Card2(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    public Card2() {
        this(1, "HEART");
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2(10, "HEART");
//        c.NUMBER = 5; ERROR

        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
