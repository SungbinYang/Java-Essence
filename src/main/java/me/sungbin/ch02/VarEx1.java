package me.sungbin.ch02;

/**
 * packageName : me.sungbin.ch02
 * fileName : VarEx1
 * author : rovert
 * date : 2022/05/11
 * description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/05/11       rovert         최초 생성
 */

public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 22;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}
