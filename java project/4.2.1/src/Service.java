import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁 "+Thread.currentThread().getName()
                        +" "+System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//从控制台中打印得时间来看，两个线程几乎同时进入lock()方法后面的代码。说明在此使用了lock.readLock()读锁可以提高程序运行效率，允许多个线程同时执行lock()方法后面的代码。
