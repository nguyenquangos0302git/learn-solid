package practice.after;

public class City extends Domestic {

    protected City(Buyer buyer) {
        super(buyer);
    }

    @Override
    public void rent() {
        System.out.println(buyer.getName());
    }

    @Override
    public void buy() {
        System.out.println(buyer.getName());
    }
}
