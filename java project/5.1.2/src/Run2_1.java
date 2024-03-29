import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2_1 {
    static public class MyTaaskA extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("A运行了! 时间为: " + new Date());
                Thread.sleep(5000);
                System.out.println("A结束了! 时间为: " + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTaaskA taaskA = new MyTaaskA();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2022-08-28 9:55:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间: " + dateRef.toLocaleString() + "当前时间：" + new Date().toLocaleString());
            timer.schedule(taaskA, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}



