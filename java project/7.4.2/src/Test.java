import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        //共享变量SimpleDateFormat 导致 java.lang.NumberFormatException: multiple points
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{"2000-01-01", "2001-02-02", "2003-03-03", "2004-04-04","2004-04-05","2004-04-06","2004-04-07"};
        MyThread[] threadArray = new MyThread[7];
        for (int i = 0; i < dateStringArray.length; i++) {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }
        for (int i = 0; i < dateStringArray.length; i++) {
            threadArray[i].start();
        }
    }
}