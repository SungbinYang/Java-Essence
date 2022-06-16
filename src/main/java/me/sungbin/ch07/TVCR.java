package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : TVCR
 * @date : 2022/06/15
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/15       rovert         최초 생성
 */

class TV2 {
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

class VCR {
    boolean power;
    int counter = 0;

    void power() {
        power = !power;
    }

    void play() {
        System.out.println("play");
    }

    void stop() {
        System.out.println("stop");
    }

    void rew() {
        System.out.println("rew");
    }

    void ff() {
        System.out.println("ff");
    }
}

public class TVCR extends TV2 {
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}
