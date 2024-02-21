/**
 * @author yyx
 */
public class HuaweiFactory implements Factory{
    @Override
    public Phone Phone() {
        return new HuaweiPhone();
    }

    @Override
    public Watch watch() {
        return new HuaweiWatch();
    }
}
