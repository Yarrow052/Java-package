/**
 * @author yyx
 */
public class BenzBuilder extends Builder {
    @Override
    public void buildEngine() {
        car.setEngine("奔驰发动机");
    }

    @Override
    public void buildWheel() {
        car.setWheel("奔驰轮子");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
