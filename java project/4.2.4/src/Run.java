public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }
}
//从控制台中打印的结果来看，“写读”操作也是互斥的。
//“读写”、“写读”和“写写”都是互斥的；而“读读”是异步的，非互斥的。