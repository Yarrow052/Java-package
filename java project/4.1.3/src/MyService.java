import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try{
            lock.lock();
            System.out.println(
                    "A"
            );
            condition.await();
            System.out.println("B");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}