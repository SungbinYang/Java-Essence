package me.sungbin.ch09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch09
 * @fileName : ScannerEx3
 * @date : 2022/07/16
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/07/16       rovert         최초 생성
 */

public class ScannerEx3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data3.txt"));
        int cnt = 0;
        int totalSum = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while (sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }

        System.out.println("Line: " + cnt + ", Total: " + totalSum);
    }
}
