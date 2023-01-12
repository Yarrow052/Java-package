public class Main1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

//程序运行后在控制台输出空指针异常。在 Java 的多线程技术中，可以对多线程中的异常进行“捕捉”，使用的是 UncaughtExceptionHandler 类，从而可以对发送的异常进行有效的处理。