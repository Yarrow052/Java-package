public abstract class ShopCRP {
    public abstract String getShopping();
}

class Online extends ShopCRP {
    @Override
    public String getShopping() {
        return "线上商店销售";
    }
}

class Offline extends ShopCRP {
    @Override
    public String getShopping() {
        return "线下商店销售";
    }
}

class Fruit {
    private ShopCRP shopCRP;

    public void setShopCRP(ShopCRP shopCRP) {
        this.shopCRP = shopCRP;
    }

    public void addFruit() {
        System.out.println(String.format("%s苹果", shopCRP.getShopping()));
    }
}

class test {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setShopCRP(new Online());
        fruit.addFruit();

        fruit.setShopCRP(new Offline());
        fruit.addFruit();
    }
}
