public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    System.out.println("wait begin time = "+System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait   end time = "+System.currentTimeMillis());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };

    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("notify begin time = "+System.currentTimeMillis());
                lock.notifyAll();
                System.out.println("notify   end time = "+System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(runnable);
        t.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable1);
        t2.start();
    }
}
