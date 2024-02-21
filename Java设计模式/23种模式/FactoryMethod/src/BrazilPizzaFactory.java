/**
 * @author yyx
 */

public class BrazilPizzaFactory extends PizzaFactory{
    @Override
    public Pizza producePizza() {
        Pizza pizza = new BrazilPizza(); //创建巴西pizza的对象
        return pizza;
    }
}