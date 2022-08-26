import java.util.concurrent.locks.ReentrantReadWriteLock;
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁 "+ Thread.currentThread().getName()
                        +" "+System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// 使用写锁代码lock.writeLock()的效果就是同一时间只允许一个线程执行lock()方法后面的代码。