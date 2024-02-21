public class test {
    public static void main(String[] args) {
        System.out.println("点一杯焦糖奶茶");
        MilkTea caramelMilkTea = new CaramelMilkTea();
        System.out.println(caramelMilkTea.getName() + ",总价格：" + caramelMilkTea.getPrice() + "元");

        System.out.println("加珍珠");
        caramelMilkTea = new Pearl(caramelMilkTea);
        System.out.println(caramelMilkTea.getName() + ",总价格：" + caramelMilkTea.getPrice() + "元");

        System.out.println("再加椰果");
        caramelMilkTea = new Coconut(caramelMilkTea);
        System.out.println(caramelMilkTea.getName() + ",总价格：" + caramelMilkTea.getPrice() + "元");
    }
}
