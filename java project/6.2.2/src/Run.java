public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}

//非单例设计模式
//控制台打印出了3种hashCode，说明创建出了3个对象，并不是单例的，这就是“错误的单例模式”。