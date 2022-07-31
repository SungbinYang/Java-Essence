package me.sungbin.ch11;

import java.util.TreeSet;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : TreeSetEx2
 * @date : 2022/07/30
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/30       rovert         최초 생성
 */

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45,  65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
        }

        System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
        System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
    }
}
