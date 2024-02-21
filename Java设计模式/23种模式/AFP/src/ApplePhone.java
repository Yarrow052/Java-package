/**
 * @author yyx
 */
public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }

    @Override
    public void send() {
        System.out.println("苹果手机发信息");
    }
}
