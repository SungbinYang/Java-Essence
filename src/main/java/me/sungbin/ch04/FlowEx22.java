package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx22
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for (int j : arr) {
            System.out.printf("%d ", j);
            sum += j;
        }

        System.out.println();
        System.out.println("sum = " + sum);
    }
}
