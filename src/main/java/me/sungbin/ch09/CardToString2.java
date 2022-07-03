package me.sungbin.ch09;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : CardToString2
 * @date : 2022/07/02
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/02       rovert         최초 생성
 */

class Card2 {
    String kind;
    int number;

    public Card2() {
        this("SPADE", 1);
    }

    public Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "kind: " + kind + ", number: " + number;
    }
}

public class CardToString2 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2();

        System.out.println(c1);
        System.out.println(c2);
    }
}
