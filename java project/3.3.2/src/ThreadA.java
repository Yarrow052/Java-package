import java.util.Date;

public class ThreadA extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i < 100; i++) {
                if (Tools.t.get() == null){
                    Tools.t.set(new Date());
                }
                System.out.println("A "+Tools.t.get().getTime());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
