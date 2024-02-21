/**
 * @author yyx
 */

public class ChinaPizzaFactory extends PizzaFactory{
    @Override
    public Pizza producePizza() {
        Pizza pizza = new ChinaPizza(); //创建中国pizza的对象
        return pizza;
    }
}

