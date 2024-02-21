/**
 * @author yyx
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=====BMW=====");
        //创建指挥者对象
        Director director = new Director(new BMWBuilder());
        //指挥者组装汽车
        Car car = director.construct();
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());

        System.out.println("=====奔驰=====");
        //创建指挥者对象
        Director director1 = new Director(new BenzBuilder());
        //指挥者组装汽车
        Car car1 = director1.construct();
        System.out.println(car1.getEngine());
        System.out.println(car1.getWheel());

    }
}
