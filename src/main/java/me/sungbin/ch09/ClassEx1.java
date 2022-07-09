package me.sungbin.ch09;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : ClassEx1
 * @date : 2022/07/02
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/02       rovert         최초 생성
 */

final class Card3 {
    String kind;
    int num;

    public Card3() {
        this("SPADE", 1);
    }

    public Card3(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return kind + ":" + num;
    }
}

public class ClassEx1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Card3 c = new Card3("HEART", 3);
        Card3 c2 = Card3.class.newInstance();

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
