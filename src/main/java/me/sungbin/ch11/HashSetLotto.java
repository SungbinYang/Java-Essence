package me.sungbin.ch11;

import java.util.*;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : HashSetLotto
 * @date : 2022/07/29
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/29       rovert         최초 생성
 */

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);
        Collections.sort(list);

        System.out.println(list);
    }
}
