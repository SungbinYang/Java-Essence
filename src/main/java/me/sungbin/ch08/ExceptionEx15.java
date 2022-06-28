package me.sungbin.ch08;

import java.io.File;
import java.io.IOException;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : ExceptionEx15
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

public class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다.");
            }
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);

            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
