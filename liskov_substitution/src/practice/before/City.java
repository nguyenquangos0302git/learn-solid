package practice.before;

public class City extends Property {

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
