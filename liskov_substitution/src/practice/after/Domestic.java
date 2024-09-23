package practice.after;

public abstract class Domestic extends Property {
    protected Domestic(Buyer buyer) {
        super(buyer);
    }

    public abstract void rent();

    public abstract void buy();
}
