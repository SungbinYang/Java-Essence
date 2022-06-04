package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx16
 * @date : 2022/06/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/03       rovert         최초 생성
 */

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int) (pi * 1000) / 1000f;
        System.out.println(shortPi);
    }
}
