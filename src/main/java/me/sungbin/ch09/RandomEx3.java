package me.sungbin.ch09;

import java.util.Arrays;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : RandomEx3
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class RandomEx3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(getRand(5, 10) + ",");
        }

        System.out.println();

        int[] result = fileRand(new int[10], new int[] {2, 3, 7, 5});

        System.out.println(Arrays.toString(result));
    }

    public static int[] fileRand(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        }

        return arr;
    }

    public static int[] fileRand(int[] arr, int[] data) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = data[getRand(0, data.length - 1)];
        }

        return arr;
    }

    public static int getRand(int from, int to) {
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }
}
