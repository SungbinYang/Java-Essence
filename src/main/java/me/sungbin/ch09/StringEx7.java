package me.sungbin.ch09;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : StringEx7
 * @date : 2022/07/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/03       rovert         최초 생성
 */

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";
        int index = fullName.indexOf('.');
        String fileName = fullName.substring(0, index);
        String ext = fullName.substring(index + 1);

        System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
        System.out.println(fullName + "의 확장자는 " + ext);
    }
}
