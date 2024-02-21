public class MyThread extends Thread {
    private Object lock;
    private String showChar;
    private int showNumPosition;
    private int printCount = 0;//统计打印了几个字母
    volatile private static int addNumber = 1;

    public MyThread(Object lock, String showChar, int showNumPosition) {
        super();
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }
    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    if (showNumPosition == addNumber % 3) {
                        System.out.println("ThreadName="
                                + Thread.currentThread().getName()
                                + " runCount=" + addNumber + " " + showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if (3 == printCount) {
                            break;
                        }
                    } else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}