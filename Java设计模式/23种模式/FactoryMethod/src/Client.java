/**
 * @author yyx
 */
public class Client {
    public static void main(String[] args) {
        PizzaFactory factory, factory1;
        Pizza pizza,pizza1;
        factory = new ChinaPizzaFactory();
        factory1 = new BrazilPizzaFactory();
        pizza = factory.producePizza();
        pizza1 = factory1.producePizza();
        pizza.run();
        pizza1.run();
    }
}

