public class MyThread extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("正在运行的线程名称："+this.currentThread().getName()+"开始");
            Thread.sleep(2000);//延时2秒
            System.out.println("正在运行的线程名称："+this.currentThread().getName()+" 结束");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
