package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx32
 * @date : 2022/06/05
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/05       rovert         최초 생성
 */

public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x= 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x: -x;
        absY = y >= 0 ? y: -y;
        absZ = z >= 0 ? z: -z;

        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("x=%c%d%n", signY, absY);
        System.out.printf("x=%c%d%n", signZ, absZ);
    }
}
