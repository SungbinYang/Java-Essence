package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx1
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4];

        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }

        System.out.printf("tmp:%d%n", tmp);
        System.out.printf("score[%d]:%d%n", 7, score[7]);
    }
}
