package me.sungbin.ch06;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch06
 * @fileName : ReturnTest
 * @date : 2022/06/12
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/12       rovert         최초 생성
 */

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3, 5, result2);
        System.out.println(result2[0]);
    }

    int add (int a, int b) {
        return a + b;
    }

    void add (int a, int b, int[] result) {
        result[0] = a + b;
    }
}
