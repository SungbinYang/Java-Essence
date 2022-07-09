package me.sungbin.ch09;

import java.util.StringJoiner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : StringEx4
 * @date : 2022/07/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/03       rovert         최초 생성
 */

public class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/","[","]");

        for (String s : arr) {
            sj.add(s);
        }

        System.out.println(sj.toString());
    }
}
