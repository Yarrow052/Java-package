public class MyThread2 extends Thread {
    @Override
    public void run()
    {
        try
        {
            System.out.println("正在运行的线程名称：" + this.currentThread().getName() + " 开始时间=" + System.currentTimeMillis());
            Thread.sleep(2000);    //延时2秒
            System.out.println("正在运行的线程名称：" + this.currentThread().getName() + " 结束时间="+System.currentTimeMillis());
        }
        catch(InterruptedException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
