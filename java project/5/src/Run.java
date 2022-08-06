public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("停止线程！ stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}