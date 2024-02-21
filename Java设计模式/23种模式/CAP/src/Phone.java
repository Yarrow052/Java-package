/**
 * @author yyx
 */
public class Phone {
    public void charging(Adapter voltage) {
        if (voltage.output5V() == 5) {
            System.out.println("电压适配为5V，可以充电");
        } else if (voltage.output5V() > 5) {
            System.out.println("电压大于5V，不能充电～");
        }
    }
}
