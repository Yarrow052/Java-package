public class ShoppingOCP {
    public static void main(String[] args) {
        ShopOCP shopping = new ShopOCP();
        shopping.shop(new Apple1());
        shopping.shop(new Pear1());
        shopping.shop(new Watermelon1());
        shopping.shop(new Cherry1());
    }
}

class ShopOCP {
    public void shop(Type1 s) {
     s.type1();
    }
}

abstract class Type1 {
    abstract void type1();
}

class Apple1 extends Type1 {
    @Override
    void type1() {
        System.out.println(" 出售苹果 ");
    }
}

class Pear1 extends Type1 {
    @Override
    void type1() {
        System.out.println(" 出售梨 ");
    }
}

class Watermelon1 extends Type1 {
    @Override
    void type1() {
        System.out.println(" 出售西瓜 ");
    }
}

class Cherry1 extends Type1 {
    @Override
    void type1() {
        System.out.println(" 出售樱桃 ");
    }
}
