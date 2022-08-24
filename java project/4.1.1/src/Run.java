/**
 * @author yyx
 * @description: TODO
 * @date 2022/8/15 19:38
 */
public class Run {
    public static void main(String[] args) {
        MyService Service = new MyService();
        MyThread m1 = new MyThread(Service);
        MyThread m2 = new MyThread(Service);
        MyThread m3 = new MyThread(Service);
        MyThread m4 = new MyThread(Service);
        MyThread m5 = new MyThread(Service);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}

