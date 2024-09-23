package practice.after;

public abstract class Internation extends Property {

    protected Internation(Buyer buyer) {
        super(buyer);
    }

    public abstract void rent();
}
