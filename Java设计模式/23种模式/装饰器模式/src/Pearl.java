public class Pearl extends Add {
    public Pearl(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    protected String getName() {
        return super.getName() + ",加了珍珠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 5;
    }
}
