package me.sungbin.ch07;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch07
 * @fileName : PointTest2
 * @date : 2022/06/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/17       rovert         최초 생성
 */

class Point3 {
    int x, y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point3 {
    int z;

    public Point3D2() {
        this(100, 200, 300);
    }

    public Point3D2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class PointTest2 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}
