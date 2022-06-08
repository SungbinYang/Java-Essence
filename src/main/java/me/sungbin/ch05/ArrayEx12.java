package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx12
 * @date : 2022/06/08
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/08       rovert         최초 생성
 */

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]:" + names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp:" + tmp);
        names[0] = "Yu";

        for (String str : names) {
            System.out.println(str);
        }
    }
}
