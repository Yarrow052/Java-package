/**
 * @author yyx
 */
public class BMWBuilder extends Builder {
    @Override
    public void buildEngine() {
        car.setEngine("BMW发动机");
    }

    @Override
    public void buildWheel() {
        car.setWheel("BMW轮子");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
