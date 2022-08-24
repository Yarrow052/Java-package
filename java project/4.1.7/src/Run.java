public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.setName("B");
        b.start();

    }
}