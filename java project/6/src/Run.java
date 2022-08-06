public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("停止线程！ stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}