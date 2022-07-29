package me.sungbin.ch11;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : ListIteratorEx1
 * @date : 2022/07/29
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/29       rovert         최초 생성
 */

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();

        while (it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println();

        while (it.hasPrevious()) {
            System.out.print(it.previous());
        }

        System.out.println();
    }
}
