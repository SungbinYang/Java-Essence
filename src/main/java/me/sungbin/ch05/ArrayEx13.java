package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx13
 * @date : 2022/06/08
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/08       rovert         최초 생성
 */

public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'};
        String[] binary = {"0000", "0001", "0010", "0011"
                ,"0100", "0101", "0110", "0111"
                ,"1000", "1001", "1010", "1011"
                ,"1100", "1101", "1110", "1111"};
        String result = "";

        for (char c : hex) {
            if (c >= '0' && c <= '9') {
                result += binary[c - '0'];
            } else {
                result += binary[c - 'A' + 10];
            }
        }

        System.out.println("hex:" + new String(hex));
        System.out.println("binary : " + result);;
    }
}
