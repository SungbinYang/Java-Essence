package me.sungbin.ch09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : ScannerEx2
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data2.txt"));
        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + (double) sum / cnt);
    }
}
