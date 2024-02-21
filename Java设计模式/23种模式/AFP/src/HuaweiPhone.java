/**
 * @author yyx
 */
public class HuaweiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void send() {
        System.out.println("华为手机发信息");
    }
}
