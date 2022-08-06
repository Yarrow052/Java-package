public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        P_Thread pThread1 = new P_Thread(p1);
        P_Thread pThread2 = new P_Thread(p2);
        P_Thread pThread3 = new P_Thread(p3);
        P_Thread pThread4 = new P_Thread(p4);
        P_Thread pThread5 = new P_Thread(p5);
        P_Thread pThread6 = new P_Thread(p6);
        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();
        pThread6.start();

        C m1 = new C(myStack);
        C m2 = new C(myStack);
        C m3 = new C(myStack);
        C m4 = new C(myStack);
        C m5 = new C(myStack);
        C m6 = new C(myStack);
        C m7 = new C(myStack);
        C m8 = new C(myStack);
        C_Thread cThread1 = new C_Thread(m1);
        C_Thread cThread2 = new C_Thread(m2);
        C_Thread cThread3 = new C_Thread(m3);
        C_Thread cThread4 = new C_Thread(m4);
        C_Thread cThread5 = new C_Thread(m5);
        C_Thread cThread6 = new C_Thread(m6);
        C_Thread cThread7 = new C_Thread(m7);
        C_Thread cThread8 = new C_Thread(m8);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
        cThread6.start();
        cThread7.start();
        cThread8.start();
    }
}
