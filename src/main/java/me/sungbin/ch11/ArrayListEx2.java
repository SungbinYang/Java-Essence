package me.sungbin.ch11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : ArrayListEx2
 * @date : 2022/07/25
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/25       rovert         최초 생성
 */

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "1023456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; // 43
        int length = source.length();

        List list = new ArrayList(length / LIMIT + 10);

        for (int i = 0; i < length; i+=LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            } else {
                list.add(source.substring(i));
            }
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
