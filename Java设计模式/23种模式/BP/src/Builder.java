/**
 * @author yyx
 */
public abstract class Builder {
    protected Car car = new Car();

    public abstract void buildEngine();

    public abstract void buildWheel();

    public abstract Car createCar();

}
