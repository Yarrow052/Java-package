/**
 * @author yyx
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("华为");
        // 创建华为工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        // 生产华为手机
        Phone huaweiPhone = huaweiFactory.Phone();
        huaweiPhone.call();
        huaweiPhone.send();

        // 生产华为手表
        Watch huaweiWatch = huaweiFactory.watch();
        huaweiWatch.open();
        huaweiWatch.close();

        System.out.println("苹果");
        // 创建华为工厂
        AppleFactory appleFactory = new AppleFactory();

        // 生产华为手机
        Phone applePhone = appleFactory.Phone();
        applePhone.call();
        applePhone.send();

        // 生产华为手表
        Watch appleWatch = appleFactory.watch();
        appleWatch.open();
        appleWatch.close();
    }
}
