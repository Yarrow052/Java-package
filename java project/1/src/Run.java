
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        Service service1 = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        ThreadC threadC = new ThreadC(service1);
        threadC.setName("c");

        threadA.start();
        threadB.start();
        threadC.start();

    }
}
