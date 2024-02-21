/**
 * @author yyx
 */
//public class Adapter extends Adaptee implements Target {
//    @Override
//    public int output5V() {
//        // 获取到220V的电压
//        int a = output220V();
//        // 处理电压，转成5V
//        int b = a / 44;
//        return b;
//    }
//}

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter() {
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (adaptee != null) {
            int src = adaptee.output220V();
            System.out.println("使用对象适配器进行适配");
            dst = src / 44;
            System.out.println("适配完成，输出电压为：" + dst);
        }
        return dst;
    }
}
