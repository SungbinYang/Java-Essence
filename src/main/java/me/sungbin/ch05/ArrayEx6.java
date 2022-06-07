package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx6
 * @date : 2022/06/07
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/07       rovert         최초 생성
 */

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int j : score) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
