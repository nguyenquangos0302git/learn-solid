package practice.after;

public class Foreign extends Internation {

    protected Foreign(Buyer buyer) {
        super(buyer);
    }

    @Override
    public void rent() {
        System.out.println(buyer.getName());
    }

}
