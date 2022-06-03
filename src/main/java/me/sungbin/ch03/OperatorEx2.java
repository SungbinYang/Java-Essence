package me.sungbin.ch03;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch03
 * @fileName : OperatorEx2
 * @date : 2022/06/03
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/03       rovert         최초 생성
 */
public class OperatorEx2 {
    public static void main(String[] args) {
        int i =5, j = 0;

        j = i++;
        System.out.println("j = i++; 실행 후, i=" + i + ", j =" + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j = i++; 실행 후, i=" + i + ", j =" + j);
    }
}
