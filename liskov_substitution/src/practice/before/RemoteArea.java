package practice.before;

public class RemoteArea extends Property {

    protected RemoteArea(Buyer buyer) {
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
