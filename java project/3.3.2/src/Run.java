/**
 * @author yyx
 * @description: TODO
 * @date 2022/8/6 14:00
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            Thread.sleep(1000);
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

