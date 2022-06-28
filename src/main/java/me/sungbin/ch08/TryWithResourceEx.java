package me.sungbin.ch08;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch08
 * @fileName : TryWithResourceEx
 * @date : 2022/06/26
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2022/06/26       rovert         최초 생성
 */

class WorkException extends Exception {
    public WorkException(String message) {
        super(message);
    }
}

class CloseException extends Exception {
    public CloseException(String message) {
        super(message);
    }
}

class CloseableResource implements AutoCloseable {

    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ")가 호출됨");

        if (exception) {
            throw new WorkException("WorkException 발생!!");
        }
    }

    @Override
    public void close() throws CloseException {
        System.out.println("close()가 호출됨.");
        throw new CloseException("CloseException 발생!!");
    }
}

public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}
