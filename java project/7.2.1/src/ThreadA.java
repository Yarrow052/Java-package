public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread name : " + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}