/**
 * 具体的水果：梨（具体实现化角色）
 */
public class pear extends Fruit{
    public pear(Person person) {
        super(person);
    }

    @Override
    public void personEatFruit() {

        super.person.eat();
        System.out.println("梨");
    }
}
