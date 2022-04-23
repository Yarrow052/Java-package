public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();//创建MyThread线程实例
        System.out.println("主线程开始时间="+System.currentTimeMillis());
        myThread.start();
        System.out.println("主线程结束时间="+System.currentTimeMillis());
    }
}