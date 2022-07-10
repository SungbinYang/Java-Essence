package me.sungbin.ch09;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : StringBufferEx2
 * @date : 2022/07/10
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/10       rovert         최초 생성
 */

public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);

        System.out.println("sb = " + sb.deleteCharAt(0));
        System.out.println("sb = " + sb.delete(3, 6));
        System.out.println("sb = " + sb.insert(3, "abc"));
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

        System.out.println("capacity = " + sb.capacity());
        System.out.println("length = " + sb.length());
    }
}
