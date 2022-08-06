public class Service {
    private boolean isContinueRun = true;
    public void runMethod() {
        String string = new String();
        while (isContinueRun == true){
            synchronized (string){}
        }
        System.out.println("停下来！");
    }
    public void stopMethod() {
            isContinueRun = false;
    }
}
