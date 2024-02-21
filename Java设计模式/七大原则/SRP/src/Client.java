public class Client{
    public static void main(String[] args){
        Fly fly = new Fly();
        fly.birds("老鹰");
        fly.birds("猫头鹰");
        fly.birds("喜鹊");

        NoFly noFly = new NoFly();
        noFly.birds("企鹅");
    }
}  