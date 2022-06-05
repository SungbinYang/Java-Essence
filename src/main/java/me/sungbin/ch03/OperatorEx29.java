package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx29
 * @date : 2022/06/04
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/04       rovert         최초 생성
 */

public class OperatorEx29 {
    public static void main(String[] args) {
     byte p = 10;
     byte n = -10;

     System.out.printf(" p = %d \t%s%n", p, toBinaryString(p));
     System.out.printf(" ~p = %d \t%s%n", ~p, toBinaryString(~p));
     System.out.printf(" ~p+1 = %d \t%s%n", ~p+1, toBinaryString(~p+1));
     System.out.printf(" ~~p = %d \t%s%n", ~~p, toBinaryString(~~p));
     System.out.println();
     System.out.printf(" n = %d%n", n);
     System.out.printf("~(n-1)=%d%n", ~(n-1));
    }

    /**
     * 2진수를 문저열로 변환하는 메소드
     * @param x
     * @return
     */
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String temp = zero + Integer.toBinaryString(x);

        return temp.substring(temp.length() - 32);
    }
}
