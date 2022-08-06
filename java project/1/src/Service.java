
public class Service {

    synchronized public static void printA(){
        try {
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入静态同步方法printA()");
            Thread.sleep(3000);
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开静态同步方法printA()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void printB(){
        try {
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步方法printB()");
            Thread.sleep(3000);
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步方法printB()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printC(){
        synchronized (Service.class){
            try {
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入Class同步块printB()");
                Thread.sleep(3000);
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开Class同步块printB()");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
