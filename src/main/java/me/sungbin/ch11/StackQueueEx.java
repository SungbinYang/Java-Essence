package me.sungbin.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : StackQueueEx
 * @date : 2022/07/27
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/27       rovert         최초 생성
 */

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");

        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= Queue =");

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
