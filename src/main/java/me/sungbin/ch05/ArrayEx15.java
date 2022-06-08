package me.sungbin.ch05;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch05
 * @fileName : ArrayEx15
 * @date : 2022/06/08
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/08       rovert         최초 생성
 */

public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                , "..-.", "--.", "....", "..", ".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-", ".-.", "...", "-"
                , "..-", "...-", ",--", "-..-", "-.--"
                , "--.."};
        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }

        System.out.println("source = " + source);
        System.out.println("morse = " + result);
    }
}
