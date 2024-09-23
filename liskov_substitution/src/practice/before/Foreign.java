package practice.before;

public class Foreign extends Property {

    protected Foreign(Buyer buyer) {
        super(buyer);
    }

    @Override
    public void rent() {
        System.out.println(buyer.getName());
    }

    @Override
    public void buy() {
        throw new RuntimeException("Method not valid");
    }
}
