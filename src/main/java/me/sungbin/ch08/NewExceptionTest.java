package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : NewExceptionTest
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);
    }
}

class MemoryException extends Exception {
    public MemoryException(String message) {
        super(message);
    }
}

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메세지: " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException e) {
            System.out.println("에러 메세지: " + e.getMessage());
            e.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도해주시기 바랍니다.");
        } finally {
            deleteTempFiles();
        }
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFiles() {
        // 파일들을 복사하는 로직
    }

    static void deleteTempFiles() {
        // 임시 파일들을 삭제하는 로직
    }
}
