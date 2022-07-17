package me.sungbin.ch10;

import java.text.ChoiceFormat;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : ChoiceFormatEx2
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A";
        int[] scores = {91, 90, 80, 88, 70, 52, 60};

        ChoiceFormat form = new ChoiceFormat(pattern);

        for (int score : scores) {
            System.out.println(score + ":" + form.format(score));
        }
    }
}
