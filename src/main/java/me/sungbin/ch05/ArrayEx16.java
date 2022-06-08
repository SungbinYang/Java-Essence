package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx16
 * @date : 2022/06/08
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/08       rovert         최초 생성
 */

public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:" + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
