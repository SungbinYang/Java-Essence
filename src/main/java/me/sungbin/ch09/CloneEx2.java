package me.sungbin.ch09;

import java.util.Arrays;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : CloneEx2
 * @date : 2022/07/02
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/02       rovert         최초 생성
 */

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
