package me.sungbin.ch04;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch04
 * @fileName : FlowEx1
 * @date : 2022/06/06
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/06       rovert         최초 생성
 */

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일때, 참인 것은%n", x);

        if (x == 0) {
            System.out.println("x==0");
        }

        if (x != 0) {
            System.out.println("x!=0");
        }

        if (!(x == 0)) {
            System.out.println("!(x==0)");
        }

        if (!(x != 0)) {
            System.out.println("!(x!=0)");
        }

        x = 1;

        System.out.printf("x=%d 일때, 참인 것은%n", x);

        if (x == 0) {
            System.out.println("x==0");
        }

        if (x != 0) {
            System.out.println("x!=0");
        }

        if (!(x == 0)) {
            System.out.println("!(x==0)");
        }

        if (!(x != 0)) {
            System.out.println("!(x!=0)");
        }

    }
}
