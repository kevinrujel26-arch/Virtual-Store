package Strategy;

public class FixedAmountDiscountStrategy implements DiscountStrategy {
    private double descuento;

    public FixedAmountDiscountStrategy(double descuento){

        this.descuento = descuento;
    }

    @Override

    public double applyDiscount(double total){

        return  total - descuento;
    }

}
