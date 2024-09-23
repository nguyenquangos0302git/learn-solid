package practice.before;

public abstract class Property {

    protected Buyer buyer;

    protected Property(Buyer buyer) {
        this.buyer = buyer;
    }

    public abstract void rent();

    public abstract void buy();

}
