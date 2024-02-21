public class Shopping {
    public static void main(String[] args) {
        Shop shopping = new Shop();
        shopping.shop(new Apple());
        shopping.shop(new Pear());
        shopping.shop(new Watermelon());
    }
}

class Shop {
    public void shop(Type s) {
        if (s.type == 1) {
            apple(s);
        } else if (s.type == 2) {
            pear(s);
        } else if (s.type == 3) {
            watermelon(s);
        }
    }

    //出售苹果
    public void apple(Type r) {
        System.out.println(" 出售苹果 ");
    }

    //出售梨
    public void pear(Type r) {
        System.out.println(" 出售梨 ");
    }

    //出售西瓜
    public void watermelon(Type r) {
        System.out.println(" 出售西瓜 ");
    }
}

class Type {
    int type;
}

class Apple extends Type {
    Apple() {
        super.type = 1;
    }
}

class Pear extends Type {
    Pear() {
        super.type = 2;
    }
}

class Watermelon extends Type {
    Watermelon() {
        super.type = 3;
    }

}
