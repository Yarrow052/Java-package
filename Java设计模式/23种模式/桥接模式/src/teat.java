/**
 * 测试类
 */
public class teat {
    public static void main(String[] args) {
        Fruit appleXiaoMing = new apple(new xiaoMing());
        appleXiaoMing.personEatFruit();

        Fruit pearXiaoMing = new pear(new xiaoMing());
        pearXiaoMing.personEatFruit();

        Fruit appleXiaoLi = new apple(new xiaoLi());
        appleXiaoLi.personEatFruit();

        Fruit pearXiaoLi = new pear(new xiaoLi());
        pearXiaoLi.personEatFruit();
    }
}
