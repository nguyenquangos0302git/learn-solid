public class InHouseProduct extends Product {

    public double getDiscount() {
        return applyExtraDiscount();
    }

    public double applyExtraDiscount() {
        return discount * 1.5;
    }

}
