public class ThreadB extends Thread{
    @Override
    public void run() {
        try{
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end 处打印");
        }catch (InterruptedException e){
            System.out.println("线程B在异常处打印");
            e.printStackTrace();
        }

    }
}