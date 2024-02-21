/**
 * @author yyx
 */

public abstract class PizzaFactory {
    public void run(){
        Pizza car = this.producePizza();//在工厂类中直接调用汽车工厂类得业务方法run()
        car.run();
    }
    public abstract Pizza producePizza();//抽象工厂方法.
}

