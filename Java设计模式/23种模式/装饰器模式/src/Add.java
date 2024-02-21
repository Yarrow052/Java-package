public abstract class Add extends MilkTea {
    private final MilkTea milkTea;

    public Add(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    protected String getName() {
        return this.milkTea.getName();
    }

    @Override
    protected int getPrice() {
        return this.milkTea.getPrice();
    }
}
