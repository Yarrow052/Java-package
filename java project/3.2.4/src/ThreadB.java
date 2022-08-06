public class ThreadB extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("  b run begin time = "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  b run   end time = "+System.currentTimeMillis());
        }catch (InterruptedException e){
            System.out.println("线程B异常");
            e.printStackTrace();
        }
    }
    synchronized public void bService(){
        System.out.println("打印了bService time = "+System.currentTimeMillis());
    }
}