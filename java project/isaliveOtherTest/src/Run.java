package test;
import mythread.CountOperate;
public class Run {
    public static void main(String[] args)
    {
        CountOperate c = new CountOperate(); //创建一个CountOperate线程实例
        Thread t1 = new Thread(c); //创建一个线程
        System.out.println("main begin t1 isAlive=" + t1.isAlive()); //输出线程状态
        t1.setName("A"); //设置线程名称
        t1.start(); //启动线程
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}