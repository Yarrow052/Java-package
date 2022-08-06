public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("我想当threadTest对象执行完毕后我再执行");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
