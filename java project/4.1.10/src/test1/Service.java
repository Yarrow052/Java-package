package test1;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void serviceGetHoldCount1(){
        try {
            lock.lock();
            System.out.println("serviceGetHoldCount1 getHoldCount()="
                    +lock.getHoldCount());
            serviceGetHoldCount2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void serviceGetHoldCount2(){
        try {
            lock.lock();
            System.out.println("serviceGetHoldCount2 getHoldCount()="
                    +lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}

