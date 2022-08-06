public class Run {
    private static ThreadLocal l1 = new ThreadLocal();

    public static void main(String[] args) {
        if (l1.get() == null){
            System.out.println("从未放过值");
            l1.set("我的值");
        }
        System.out.println(l1.get());
        System.out.println(l1.get());
    }
}