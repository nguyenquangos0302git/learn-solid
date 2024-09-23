package practice.after;

public class RemoteArea extends Domestic {

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
