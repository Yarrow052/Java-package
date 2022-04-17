public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();//创建一个MyThread线程实例
        System.out.println("begin=="+myThread.isAlive());//输出线程状态
        myThread.start();//启动线程
        System.out.println("end=="+myThread.isAlive());//输出线程状态
    }
}