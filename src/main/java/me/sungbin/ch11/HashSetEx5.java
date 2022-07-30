package me.sungbin.ch11;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : HashSetEx5
 * @date : 2022/07/29
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/29       rovert         최초 생성
 */

public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        System.out.println("A = " + setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);

        Iterator it = setB.iterator();

        while (it.hasNext()) {
            Object tmp = it.next();

            if (setA.contains(tmp)) {
                setKyo.add(tmp);
            }
        }

        it = setA.iterator();

        while (it.hasNext()) {
            Object tmp = it.next();

            if (!setB.contains(tmp)) {
                setCha.add(tmp);
            }
        }

        it = setA.iterator();

        while (it.hasNext()) {
            setHab.add(it.next());
        }

        it = setB.iterator();

        while (it.hasNext()) {
            setHab.add(it.next());
        }

        System.out.println("A ∩ B = " + setKyo);
        System.out.println("A ∪ B = " + setHab);
        System.out.println("A - B = " + setCha);

        setA.iterator();
    }
}
