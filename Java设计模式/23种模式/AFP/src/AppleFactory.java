/**
 * @author yyx
 */
public class AppleFactory implements Factory {
    @Override
    public Phone Phone() {
        return new ApplePhone();
    }

    @Override
    public Watch watch() {
        return new AppleWatch();
    }
}
