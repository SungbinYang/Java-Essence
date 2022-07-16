package me.sungbin.ch09;

import java.util.Random;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : RandomEx1
 * @date : 2022/07/12
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/12       rovert         최초 생성
 */

public class RandomEx1 {
    public static void main(String[] args) {
        Random rand = new Random(1);
        Random rand2 = new Random(1);

        System.out.println("= rand =");

        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":" + rand.nextInt());
        }

        System.out.println();

        System.out.println("= rand2 =");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":" + rand2.nextInt());
        }
    }
}
