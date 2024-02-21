/**
 * 具体的水果：苹果（具体实现化角色）
 */
public class apple extends Fruit{
    public apple(Person person) {
        super(person);
    }

    @Override
    public void personEatFruit() {

        super.person.eat();
        System.out.println("苹果");
    }
}
