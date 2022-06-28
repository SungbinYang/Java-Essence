package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : ChainedExceptionEx
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

class InstallException extends Exception {
    public InstallException(String message) {
        super(message);
    }
}

class SpaceException2 extends Exception {
    public SpaceException2(String message) {
        super(message);
    }
}

class MemoryException2 extends Exception {
    public MemoryException2(String message) {
        super(message);
    }
}

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 e) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(e);

            throw ie;
        } catch (MemoryException2 e) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(e);

            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException2, MemoryException2 {
        if (!enoughSpace()) {
            throw new SpaceException2("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) {
            throw new MemoryException2("메모리가 부족합니다.");
//            throw new RuntimeException(new MemoryException2("메모리가 부족합니다."));
        }
    }

    static void copyFiles() {
        // 파일들을 복사하는 로직
    }

    static void deleteTempFiles() {
        // 임시파일들을 삭제하는 로직
    }
}
