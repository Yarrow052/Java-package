public class Coconut extends Add {
    public Coconut(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    protected String getName() {
        return super.getName() + ",加了椰果";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 3;
    }
}
