package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx5
 * @date : 2022/06/07
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/07       rovert         최초 생성
 */

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int j : score) {
            sum += j;
        }

        average = sum / (float) score.length;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    }
}
