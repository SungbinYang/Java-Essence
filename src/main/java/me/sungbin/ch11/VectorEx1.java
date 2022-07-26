package me.sungbin.ch11;

import java.util.Vector;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : VectorEx1
 * @date : 2022/07/25
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/25       rovert         최초 생성
 */

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");

        print(v);

        v.trimToSize();
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
