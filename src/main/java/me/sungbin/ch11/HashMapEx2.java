package me.sungbin.ch11;

import java.util.*;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : HashMapEx2
 * @date : 2022/07/31
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/31       rovert         최초 생성
 */

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        
        map.put("김자바", new Integer(90));
        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("인자바", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();
        
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();

            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }
        
        set = map.keySet();
        System.out.println("참가자 명단: " + set);

        Collection values = map.values();
        it = values.iterator();
        
        int total = 0;
        
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / set.size());
        System.out.println("최고 점수 : " + Collections.max(values));
        System.out.println("최저 점수 : " + Collections.min(values));
        
    }
}
