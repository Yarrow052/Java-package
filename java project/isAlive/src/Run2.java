public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();//创建MyThread线程实例
        System.out.println("begin="+myThread.isAlive());//输出线程状态
        myThread.start();//启动线程
        Thread.sleep(1000);//延时1000毫秒
        System.out.println("end="+myThread.isAlive());//输出线程状态
    }
}
