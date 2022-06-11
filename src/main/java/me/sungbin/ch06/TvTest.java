package me.sungbin.ch06;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch06
 * @fileName : TvTest
 * @date : 2022/06/11
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/11       rovert         최초 생성
 */

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class TvTest {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}
