public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
//此实验说明“读写”操作是互斥的。即只要出现“写操作”的过程，就是互斥的。