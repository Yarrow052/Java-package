/**
 * @author yyx
 * @description: TODO
 * @date 2022/8/6 14:10
 */
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        if (t1.get() == null){
            System.out.println("从没放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
