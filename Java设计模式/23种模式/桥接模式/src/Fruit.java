/**
 * 抽象的水果（抽象化角色）
 */
public abstract class Fruit {
    protected Person person;

    protected Fruit(Person person){
        this.person = person;
    }

    public abstract void personEatFruit();
}
