public class MyThread extends Thread{
    public MyThread() {
        //调用currentThread()方法输出当前线程名称
        System.out.println("构造方法的打印:"+ Thread.currentThread().getName());
    }
    @Override
    public void run() {
        //调用currentThread()方法输出当前线程名称
        System.out.println("run方法的打印:"+Thread.currentThread().getName());
    }
}