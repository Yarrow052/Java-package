/**
 * @author yyx
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Car construct() {
        builder.buildEngine();
        builder.buildWheel();
        return builder.createCar();
    }
}
