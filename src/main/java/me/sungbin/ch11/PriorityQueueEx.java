package me.sungbin.ch11;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch11
 * @fileName : PriorityQueueEx
 * @date : 2022/07/27
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/27       rovert         최초 생성
 */

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();

        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);

        Object obj = null;

        while ((obj = pq.poll()) != null) {
            System.out.println(obj);
        }
    }
}
