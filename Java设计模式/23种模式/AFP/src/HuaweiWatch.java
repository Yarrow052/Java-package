/**
 * @author yyx
 */
public class HuaweiWatch implements Watch {
    @Override
    public void open() {
        System.out.println("华为手表打开");
    }

    @Override
    public void close() {
        System.out.println("华为手表关闭");
    }
}
