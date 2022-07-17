package me.sungbin.ch10;

import java.text.ChoiceFormat;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch10
 * @fileName : ChoiceFormatEx1
 * @date : 2022/07/17
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/17       rovert         최초 생성
 */

public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};
        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int score : scores) {
            System.out.println(score + ":" + form.format(score));
        }
    }
}
