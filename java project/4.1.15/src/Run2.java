public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
//说明线程在等待时间到达前，可以被其他线程提前唤醒。
//jdbc