package me.sungbin.ch11;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : TreeSetLotto
 * @date : 2022/07/30
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/30       rovert         최초 생성
 */

public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);
    }
}
