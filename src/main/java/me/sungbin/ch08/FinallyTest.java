package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : FinallyTest
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();
        }
    }

    static void startInstall() {
        // 프로그램 설치 로직
    }

    static void copyFiles() {
        // 파일 복사 로직
    }

    static void deleteTempFiles() {
        // 파일 삭제 로직
    }
}
