public class Service {

    Object objectA = new Object();
    public void methodA() {
        synchronized (objectA) {
            System.out.println(" methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println(" methodA end");
        }
    }
    Object objectB = new Object();
    public void methodB() {
        synchronized (objectB) {
            System.out.println(" methodB begin");
            System.out.println(" methodB end");
        }
    }

}
