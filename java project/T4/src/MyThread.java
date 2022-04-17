public class MyThread extends Thread {
    private int count=5;
    @Override
    synchronized public void run() {
        super.run() ;
        count-- ;
        //此处不要用for语句，因为使用同步后其他线程就得不到运行的机会了
        System. out .println("由"+this. currentThread() .getName()+"计算,count="+count) ;
    }
}