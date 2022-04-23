public class Run {
    public static void main(String[] args)
    {

        MyThread myThread = new MyThread();//创建MyThread线程实例
        System.out.println("开始时间=" + System.currentTimeMillis());
        myThread.run();
        System.out.println("结束时间=" + System.currentTimeMillis());
    }
}
